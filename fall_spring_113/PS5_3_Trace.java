/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class PS5_3_Trace {
    static int meth(int a) { 
        int b, c, k, d;
    
    b = a + (int) Math.sqrt(a + a / 2 * 2);
    d = b - a;
    c = (int) Math.pow(d, 2); 
    for (k = 0; k < b - a; k++) {
        if (c == d * (b - a)) { 
            d /= 2;
        }
         else { 
        // Your code here if the condition is not met 
        } 
    }
    c /= 2;
        return (c + d); 
    }
    public static void main(String[] args) { 
        System.out.println(meth(2));
    }
}
   