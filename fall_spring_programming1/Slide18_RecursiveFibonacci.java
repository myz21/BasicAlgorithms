/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_RecursiveFibonacci {
    public static long fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(11));
    }
}
