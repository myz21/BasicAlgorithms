/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_ComputeFactorial {
    public static double computeFactorial(int n){
        if(n == 0)
            return 1;
        if(n==1)
            return 1;
        
        return n*computeFactorial(n-1);
    }
    public static void main(String[] args){
        System.out.println(computeFactorial(6));
    }
}
