/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author zer3
 */
public class Slide7_FindProduct {
    public static void findProduct(int[] A){
        int[] productArr = new int[A.length];
        int product = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i==j) {
                    continue;
                }
                product*=A[j];
            }
            productArr[i]=product;
            product = 1;
        }
        System.out.println(Arrays.toString(productArr));
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter numbers: ");
     int [] arr = new int[6]; 
     for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }
     findProduct(arr);
   }
}