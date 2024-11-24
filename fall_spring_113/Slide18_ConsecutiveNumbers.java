/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_ConsecutiveNumbers {
    public static void consecutive(int n){
        if (n==0) return;
        
        System.out.println(n);
        consecutive(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        consecutive(5);
    }
}
