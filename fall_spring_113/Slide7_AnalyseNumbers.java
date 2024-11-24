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
public class Slide7_AnalyseNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = sc.nextInt();
        int[] array = new int [n];
        
        int sum = 0;
        int above = 0;
        
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        
        double avg = sum/n;
        for (int value: array) {

            if(value>avg){
               above++;
            }
        }
        
        System.out.println("Sum: "+sum);
        System.out.println("above: "+above);
        
        
    }   

}
 
