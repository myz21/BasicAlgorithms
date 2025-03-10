/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class PS4_J_Sum {
    public static void withoutPow(double x){
        double sum = 0;
        double term = 1;
        double base = x;
        System.out.print(Math.log(term) / Math.log(base) +" ");
        for (int i = 0; i < 100; i++) {
            sum+=term;
            term*=x;
            System.out.print(Math.log(term) / Math.log(base) +" ");
        }
        System.out.println("\n"+sum);
    }
    public static void main(String[] args) {
        withoutPow(2);
    }

}
