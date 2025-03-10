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
public class PS7_H_DotProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        int dotProd=0;
        int product;
        for (int i = 0; i < 5; i++) {
            A[i]=sc.nextInt();
          }  
          
        for (int i = 0; i < 5; i++) {
            B[i]=sc.nextInt();
        }
         for (int i = 0; i < 5; i++) {
           C[i]=A[i]+B[i];
        }
        for (int i = 0; i < 5; i++) {
            product=A[i]*C[i];
            dotProd+=product;
        }
        System.out.println(dotProd);
    }
}
