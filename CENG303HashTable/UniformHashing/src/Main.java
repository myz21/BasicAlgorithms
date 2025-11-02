/**
 * Main.java
 * Entry point of the program — coordinates the entire experiment.
 *
 * TODO: Implement all key steps:
 *   - Define distributions and parameters (Uniform and gaussian)
 *   - Define problem sizes: n = 10^3, 10^3.5, ..., 10^6
 *   - For each (distribution, n, workload):
 *       * Run 5 trials (seed = baseSeed + trialIndex)
 *       * Generate keys according to distribution
 *       * Perform workloads:
 *           - Build-only: n inserts (unique doubles)
 *           - Mixed: 50% insert, 25% search, 25% delete
 *       * Measure time using System.nanoTime()
 *       * Compute average time, throughput, and hash table stats
 *       * Write results to CSV using CsvWriter.appendResult()
 *   - Repeat the same workload using HashMap<Double,Integer>
 *     with the same random seed and operations.
 *
 * Important notes:
 *   - DO NOT print anything during timing (it affects performance)
 *   - For HashMap results, set max_chain, mean_chain, load_factor = -1
 *   - baseSeed = 1234; trialSeed = 1234 + trialIndex
 *   - Write distribution parameters as comments and print before/after only
 */

 import java.util.*;

 public class Main {
     public static void main(String[] args) throws Exception {
         // TODO: define baseSeed = 1234L
         // TODO: define distributions (Uniform, Gaussian, etc.) and parameters
         // TODO: create list of n values (10^3 to 10^6)
         // TODO: write CSV header (CsvWriter.writeHeader())
 
         // Example structure (comment only):
 
         // for each distribution:
         //   for each n:
         //     for each workload in {"build", "mixed"}:
         //       totalTime = 0;
         //       for trial = 0..4:
         //         seed = baseSeed + trial;
         //         Random rand = new Random(seed);
         //         generate data based on distribution
         //         create new HashTable(M);
         //         long start = System.nanoTime();
         //         perform operations
         //         long end = System.nanoTime();
         //         totalTime += (end - start);
         //       avgTime = totalTime / 5;
         //       throughput = ops / (avgTime / 1e9);
         //       compute stats (max_chain, mean_chain, load_factor)
         //       CsvWriter.appendResult(..., "student", ...);
         //       repeat same for HashMap<Double,Integer> with impl="hashmap"
     }
 }
 