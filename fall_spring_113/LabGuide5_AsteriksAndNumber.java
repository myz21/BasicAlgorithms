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
public class LabGuide5_AsteriksAndNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
   
    if(num>=1 && num<=9)    
        fillWithChar('*',num);
    else
        System.exit(0);
     
    
    }
    public static void fillWithChar(char ch, int num){
        for (int i = 1; i <= num; i++) {
            printNNumber(i);
            printNChar(num-i,'*');
            System.out.println("");
        }
    }
    public static void printNNumber(int num){
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
        }
   }
    public static void printNChar(int num, char ch){
        for (int i = 1; i <= num; i++) {
            System.out.print(ch);
        }
    }
}