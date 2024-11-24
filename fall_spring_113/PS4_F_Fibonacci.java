/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class PS4_F_Fibonacci {
    public static void FibonacciSumUntilN(int n){
        int first = 1;
        int second = 1;
        int next=0;
        if (n== 1) {
            return;
        }
        else if (n == 2) {
            System.out.print("1 1\n");
            return;
        }
        System.out.print("1 1 ");
        next = first+second;        
        while (next<n){
            System.out.printf("%d ",next);
            first = second;
            second = next;
            next = first+second;
        } 
        System.out.println("");
    }
    public static void fibToTerm(int term) {
        int first, second, next;
        first= second = 1;
        if (term == 1) {
            System.out.print("1");
            return;
        }
        else if (term == 2) {
            System.out.print("1, 1");
            return;
        }
        System.out.print("1, 1");
        next = first + second;
        while (next < term) {
            System.out.print(", " + next);
            first =second;
            second =next;
            next = first + second;
        }
    }
    public static void main(String[] args) {
    FibonacciSumUntilN(20);
    //fibToTerm(2);
    }
}
