/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide7_GreatestCommonDivisorMethod {
    public static int gcd(int n1, int n2){
        int k = 1;
        int gcd = 1;
        while(n1>=k && n2>=k){
            if (n1%k==0 && n2%k==0) {
                gcd = k;
            }
        k++;
        }
       return gcd;
    }      
    public static void main(String[] args) {
        System.out.println(gcd(91,78));
    }
}
