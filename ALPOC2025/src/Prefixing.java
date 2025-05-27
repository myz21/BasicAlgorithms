import.java.util.*;

public class Prefixing{
    

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        //int target = sc.nextInt();
    
        int[] numbers = new int[N];
            
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
    
        int[] prefix = new int[N + 1];
    
        prefix[0] = 0;
    
        for (int i = 1; i <= N; i++) {
            prefix[i] = numbers[i] +prefix[i-1];
        }
    
        for (int i = 0; i < N; i++) {
            System.out.println(prefix[i];)
        }
    }

}