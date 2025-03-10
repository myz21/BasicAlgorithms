/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;
import java.util.Scanner;
/**
 *
 * @author zer3
 */
public class Midterm_SumWithoutFactAndPow {
    public static double factorial(int n){
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
    return result;
    }
    public static double power(double x, int n){
        double result = 1;
        for (int i = 1; i <=n; i++) {
            result*=x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x value: ");
        double x = sc.nextDouble();
        System.out.println(formulaOutput(x));
        
    }   
    public static double formulaOutput(double x){
        
        int n =1;
        double term = x;
        double sgn = -1;
        double sum= 0;
        while(true){
            term= power(x,2*n-1)/factorial(2*n-1);
            if (term<0.00005) {
               break;
            }
            else{
                sgn*=-1;
                term*=sgn;
                sum+=term;
            }
        n++;
        }
    return sum;
    }
}
