/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_EuclidGreatestCommonDivisorRecursion {
    
    public static int euclidGcd(int t1, int t2){
        t1 = Math.abs(t1);
        t2 = Math.abs(t2);
        
        int r = t1%t2;
        while(r!=0){
          t1 = t2;
          t2 = r;
          r = t1 % t2;
          
        }
        return t2;
    }
    
    public static int euclidGcdRecursion(int t1, int t2){
        if (t1 % t2 == 0) {
            return t2;
        }
        else
            return euclidGcdRecursion(t2 , t1 % t2);
    }
    
    public static void main(String[] args) {
        System.out.println(euclidGcdRecursion(144,96));
    }
}
