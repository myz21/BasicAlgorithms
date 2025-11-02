/**
 * CsvWriter.java
 * Helper class for writing results to CSV.
 *
 * TODO: Implement methods to write the header and append rows.
 *   - writeHeader(): creates/overwrites CSV with header line
 *   - appendResult(...): appends one result row
 *
 * Notes (comment only):
 *  - For HashMap baseline, use -1 for chain stats
 *  - Use try-with-resources for file writing
 *  - Header format:
 *    distribution,params,n,workload,impl,avg_time_ns,ops,throughput_ops_per_s,max_chain,mean_chain,load_factor
 */

 import java.io.FileWriter;
 import java.io.IOException;
 
 public class CsvWriter {
     private static final String FILE_NAME = "results.csv";
 
     public static void writeHeader() {
         // TODO: open file and write CSV header
         // TODO: header = "distribution,params,n,workload,impl,avg_time_ns,ops,throughput_ops_per_s,max_chain,mean_chain,load_factor"
     }
 
     public static void appendResult(String distribution, String params, int n,
                                     String workload, String impl, long avgTimeNs,
                                     int ops, double throughputOpsPerSec,
                                     double maxChain, double meanChain, double loadFactor) {
         // TODO: open file in append mode and write one line
         // TODO: format with commas and new line
     }
 }
 