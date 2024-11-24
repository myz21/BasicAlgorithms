/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Midterm_Trace_Q5 {
    static int a = 10;
    
    public static void meth1(int b) {
        a = b % 2;
    }
    
    public static int meth2(int a, int b) {
        meth1(b);
        return ++a + b;
    }
    
    public static void main(String[] args) {
        int b = 2; // Örnek bir değer
       System.out.println(a + meth2(a, b) + a + b);
        //Why it did not be 10+3+0+2?
    }
}

