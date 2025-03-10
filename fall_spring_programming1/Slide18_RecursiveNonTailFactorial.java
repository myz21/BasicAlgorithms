/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_RecursiveNonTailFactorial {
    public static long nonTailFactorial(long n, long result){
        if(n==0)
            return result;
        
        return nonTailFactorial(n-1,n*result);
        
    }
    public static long nonTailFactorial(long n){
        return nonTailFactorial(n,1);
    }

    public static void main(String[] args) {
        System.out.println(nonTailFactorial(6));
    }
}

