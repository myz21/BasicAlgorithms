package fall_spring_113;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zer3
 */
public class Slide5_Sum_Until_A_Num {
   public static void main(String[] args) {
     double sum  = 0;
     double term = 1.0;
     double payda = 1.0;
     while(Math.abs(term)>= 0.00025) {
           
            term = 1.0/payda;
            if (payda % 2 ==0 ) {
                term *=-1;
            }
            sum+=term;
            payda++; 
        } 
        System.out.println(sum);
        System.out.println(meth(9056));

        
   }
   static int meth(int n) {
    int d, s;
    s = 0;
    while (n > 0) {
        d = n % 10;
        s += d;
        n /= 10;
    }
    return s;
 }

}
