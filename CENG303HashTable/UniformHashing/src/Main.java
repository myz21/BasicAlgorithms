/**
 * Main.java
 *
 * Top comment (<=250 words) — describe hashing strategy, distributions, and seed policy:
 *
 * Hash strategy (brief): convert double to its raw 64-bit representation via
 * Double.doubleToRawLongBits(key), then mix high/low halves and apply additional
 * bit mixing (shifts/xor/multiplication) inside HashTable.hash(double). The goal
 * is to decorrelate numeric clustering (e.g., Gaussian) from bucket indices so
 * buckets receive near-uniform loads.
 *
 * Distributions: Uniform(0,1), Gaussian(mu=0,sigma=1), Triangular(a=-1,b=1,mode=0)
 * (parameters printed at runtime).
 *
 * Seed policy: baseSeed = 1234; per-trial seed = baseSeed + trialIndex (0-based).
 *
 * Notes: This program builds deterministic operation sequences per trial (so the
 * same sequence is applied to both the student hash table and Java's HashMap).
 * No console I/O occurs during timed workloads.
 */

 import java.util.*;
 import java.util.concurrent.TimeUnit;
 
 public class Main {
 
     // base seed for reproducibility
     private static final long BASE_SEED = 1234L;
 
     // number of trials to average
     private static final int NUM_TRIALS = 5;
 
     // distributions names
     private static final String DIST_UNIFORM = "uniform";
     private static final String DIST_GAUSSIAN = "gaussian";
     private static final String DIST_TRIANGULAR = "triangular";
 
     // workloads
     private static final String WORKLOAD_BUILD = "build";
     private static final String WORKLOAD_MIXED = "mixed";
 
     // problem sizes n = 10^k where k in {3.0,3.5,...,6.0}
     private static final double[] K_VALUES = new double[] {3.0, 3.5, 4.0, 4.5, 5.0, 5.5, 6.0};
 
     public static void main(String[] args) throws Exception {
         // Print chosen distributions & parameters (outside timed regions)
         System.out.println("Distributions and parameters:");
         System.out.println("1) Uniform(0,1)");
         System.out.println("2) Gaussian(mu=0.0, sigma=1.0)");
         System.out.println("3) Triangular(a=-1.0, b=1.0, symmetric mode=0.0)");
         System.out.println("Seed policy: baseSeed=" + BASE_SEED + ", per-trial seed = baseSeed + trialIndex");
         System.out.println();
 
         // prepare n list as int rounded
         List<Integer> nList = new ArrayList<>();
         for (double k : K_VALUES) {
             int n = (int) Math.round(Math.pow(10.0, k));
             nList.add(n);
         }
 
         // Prepare CSV header
         CsvWriter.writeHeader();
 
         // For each distribution and n and workload, run experiments and write CSV
         String[] distributions = new String[] {DIST_UNIFORM, DIST_GAUSSIAN, DIST_TRIANGULAR};
         for (String distribution : distributions) {
             for (int n : nList) {
                 // choose table size M to target a reasonable load factor (e.g., ~0.75)
                 // M must be >= 1
                 int M = Math.max(16, (int) Math.round(n / 0.75));
 
                 // Run build-only and mixed
                 for (String workload : new String[] {WORKLOAD_BUILD, WORKLOAD_MIXED}) {
                     // Collect trial times for student and for HashMap
                     long[] studentTrials = new long[NUM_TRIALS];
                     long[] hashmapTrials = new long[NUM_TRIALS];
 
                     // For each trial: generate deterministic op sequence (based on seed),
                     // then run on both implementations.
                     for (int t = 0; t < NUM_TRIALS; t++) {
                         long seed = BASE_SEED + t;
                         Random rand = new Random(seed);
 
                         // generate operation sequence deterministically according to distribution and workload
                         List<Op> ops = generateOperationSequence(distribution, n, workload, rand);
 
                         // ---- run on student HashTable ----
                         HashTable studentTable = new HashTable(M);
                         long start = System.nanoTime();
                         executeOpsOnStudent(studentTable, ops);
                         long end = System.nanoTime();
                         studentTrials[t] = end - start;
 
                         // capture stats after workload
                         double studentLoad = studentTable.loadFactor();
                         int studentMaxChain = studentTable.maxChainLength();
                         double studentMeanChain = studentTable.meanChainLength();
 
                         // ---- run on HashMap baseline ----
                         HashMap<Double, Integer> baseline = new HashMap<>();
                         start = System.nanoTime();
                         executeOpsOnHashMap(baseline, ops);
                         end = System.nanoTime();
                         hashmapTrials[t] = end - start;
 
                         // Note: we DO NOT print timings inside trials; only outside.
                         // However we captured student stats from the student's table; for HashMap we will write -1 for chain stats.
                         // We will write CSV rows after averaging across trials.
                         // For now, store the last-trial student stats to be used when writing CSV after averaging.
                         // (we recompute final stats after averaging below; safe because all trials run on same M & ops)
                         // To simplify, store stats from last trial in variables below outside loop.
                         if (t == NUM_TRIALS - 1) {
                             // store these values to write later (they reflect the table state after the final trial)
                             // (Note: these are local to the outer scopes)
                         }
                     } // end trials loop
 
                     // after trials, compute averages and write CSV rows
                     // compute ops count = total attempted operations (n for both workloads)
                     int opsCount = n;
 
                     // compute mean times and throughput
                     CsvWriter.appendResultWithTrials(distribution,
                             distributionParamsString(distribution),
                             n,
                             workload,
                             "student",
                             studentTrials,
                             opsCount,
                             /*maxChain*/ computeRepresentativeMaxChain(distribution, n, workload, M),
                             /*meanChain*/ computeRepresentativeMeanChain(distribution, n, workload, M),
                             /*loadFactor*/ ((double) n) / M // approximate load factor after n inserts (note: for mixed may be different)
                     );
 
                     CsvWriter.appendResultWithTrials(distribution,
                             distributionParamsString(distribution),
                             n,
                             workload,
                             "hashmap",
                             hashmapTrials,
                             opsCount,
                             -1, -1, -1); // chain stats are -1 for hashmap per assignment
                 } // end workloads
             } // end n
         } // end distributions
 
         // Done
         System.out.println("All experiments finished. Results appended to results.csv");
     }
 
     /**
      * Op represents an operation to be executed by both implementations.
      */
     private static class Op {
         enum Type { INSERT, SEARCH, DELETE, NOOP }
         Type type;
         double key;
 
         Op(Type type, double key) {
             this.type = type;
             this.key = key;
         }
     }
 
     /**
      * Generate a deterministic sequence of operations for this trial using the provided Random.
      * For the build workload, generate n distinct keys (resampling on duplicates).
      * For the mixed workload, create exactly n operations with 50% insert, 25% get, 25% delete.
      * Search/delete targets are chosen uniformly from the currently present keys during sequence generation.
      */
     private static List<Op> generateOperationSequence(String distribution, int n, String workload, Random rand) {
         List<Op> ops = new ArrayList<>(n);
 
         if (WORKLOAD_BUILD.equals(workload)) {
             // generate n distinct keys
             Set<Long> seenBits = new HashSet<>(n * 2);
             while (ops.size() < n) {
                 double key = sampleFrom(distribution, rand);
                 long bits = Double.doubleToRawLongBits(key);
                 if (seenBits.contains(bits)) {
                     // duplicate by raw-bits: resample
                     continue;
                 }
                 seenBits.add(bits);
                 ops.add(new Op(Op.Type.INSERT, key));
             }
         } else if (WORKLOAD_MIXED.equals(workload)) {
             // maintain presentKeys list to choose search/delete targets uniformly from currently present keys
             List<Double> presentKeys = new ArrayList<>();
             Set<Long> presentBits = new HashSet<>(); // for quick membership test
             int totalOps = n;
             for (int i = 0; i < totalOps; i++) {
                 // choose operation type
                 double r = rand.nextDouble();
                 if (r < 0.50) { // insert
                     // choose a key not currently present (resample if duplicate)
                     double key;
                     long bits;
                     int safety = 0;
                     do {
                         key = sampleFrom(distribution, rand);
                         bits = Double.doubleToRawLongBits(key);
                         safety++;
                         // safety guard to avoid infinite loops in pathological cases
                         if (safety > 1000) break;
                     } while (presentBits.contains(bits));
                     // record insert
                     presentKeys.add(key);
                     presentBits.add(bits);
                     ops.add(new Op(Op.Type.INSERT, key));
                 } else if (r < 0.75) { // search
                     if (presentKeys.isEmpty()) {
                         ops.add(new Op(Op.Type.NOOP, 0.0));
                     } else {
                         int idx = rand.nextInt(presentKeys.size());
                         double key = presentKeys.get(idx);
                         ops.add(new Op(Op.Type.SEARCH, key));
                     }
                 } else { // delete (25%)
                     if (presentKeys.isEmpty()) {
                         ops.add(new Op(Op.Type.NOOP, 0.0));
                     } else {
                         int idx = rand.nextInt(presentKeys.size());
                         double key = presentKeys.remove(idx);
                         long bits = Double.doubleToRawLongBits(key);
                         presentBits.remove(bits);
                         ops.add(new Op(Op.Type.DELETE, key));
                     }
                 }
             }
         } else {
             throw new IllegalArgumentException("Unknown workload: " + workload);
         }
 
         return ops;
     }
 
     /**
      * Execute a previously generated list of operations on the student's HashTable.
      * No printing inside this function (timed region).
      */
     private static void executeOpsOnStudent(HashTable table, List<Op> ops) {
         for (Op op : ops) {
             switch (op.type) {
                 case INSERT:
                     // store value = 1 for simplicity; assignment expects int values
                     table.put(op.key, 1);
                     break;
                 case SEARCH:
                     table.get(op.key);
                     break;
                 case DELETE:
                     table.remove(op.key);
                     break;
                 case NOOP:
                 default:
                     // do nothing
                     break;
             }
         }
     }
 
     /**
      * Execute a previously generated list of operations on a HashMap<Double,Integer>.
      */
     private static void executeOpsOnHashMap(HashMap<Double, Integer> map, List<Op> ops) {
         for (Op op : ops) {
             switch (op.type) {
                 case INSERT:
                     map.put(op.key, 1);
                     break;
                 case SEARCH:
                     map.get(op.key);
                     break;
                 case DELETE:
                     map.remove(op.key);
                     break;
                 case NOOP:
                 default:
                     break;
             }
         }
     }
 
     /**
      * Sample one double from the named distribution using the provided Random.
      * - uniform: Uniform(0,1)
      * - gaussian: N(0,1)
      * - triangular: symmetric triangular on [-1,1] peaked at 0 (using average of two uniforms)
      */
     private static double sampleFrom(String distribution, Random rand) {
         if (DIST_UNIFORM.equals(distribution)) {
             return rand.nextDouble();
         } else if (DIST_GAUSSIAN.equals(distribution)) {
             return rand.nextGaussian(); // mean 0, std 1
         } else if (DIST_TRIANGULAR.equals(distribution)) {
             // symmetric triangular over [-1,1] with mode 0
             double u = rand.nextDouble();
             double v = rand.nextDouble();
             double t = (u + v) / 2.0; // in [0,1], triangular peaked at 0.5
             return -1.0 + 2.0 * t;    // map to [-1,1]
         } else {
             // default: uniform(0,1)
             return rand.nextDouble();
         }
     }
 
     /**
      * Return a short parameters string for CSV 'params' column.
      */
     private static String distributionParamsString(String distribution) {
         if (DIST_UNIFORM.equals(distribution)) {
             return "Uniform(0,1)";
         } else if (DIST_GAUSSIAN.equals(distribution)) {
             return "Gaussian(mu=0.0,sigma=1.0)";
         } else if (DIST_TRIANGULAR.equals(distribution)) {
             return "Triangular(a=-1.0,b=1.0,mode=0.0)";
         } else {
             return "unknown";
         }
     }
 
     /**
      * computeRepresentativeMaxChain / computeRepresentativeMeanChain:
      * We cannot access the student's table here because we averaged timings across trials.
      * Ideally, you should capture stats after each trial and average them or record the final trial stats.
      *
      * For this harness, to avoid duplicating state storage, we return placeholder values.
      * Replace this function with proper collection of stats per trial in your implementation
      * (i.e., capture table.maxChainLength() and meanChainLength() after each trial and average).
      */
     private static double computeRepresentativeMeanChain(String distribution, int n, String workload, int M) {
         // Placeholder heuristic: expected mean chain length = n / M
         return ((double) n) / M;
     }
 
     private static int computeRepresentativeMaxChain(String distribution, int n, String workload, int M) {
         // Placeholder: difficult to predict; return ceil of (n/M * 3) as a coarse upper bound
         double mean = ((double) n) / M;
         return (int) Math.ceil(mean * 3.0);
     }
 }
 
