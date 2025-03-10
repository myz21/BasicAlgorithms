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
public class LabGuide1_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println( "Welcome to the Simple Calculator!"); 
        System.out.print( "Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print( "Enter the sec number: ");
        double num2 = sc.nextDouble();
    
        System.out.println("Select operations");
        System.out.println("1. Addition (+)");
        System.out.println( "2. Subtraction (-)");
        System.out.println( "3. Multiplication (*)");
        System.out.println( "4. Division (/)");
        System.out.print("Enter your operation number: ");
        
        double result = 0;
        int choice= sc.nextInt();
        
        switch(choice){
            case 1:
                result = num1 + num2;
                break;
            case 2: 
                result = num1 - num2;
                break;
            case 3:   
                result = num1 * num2;
                break;
            case 4: 
                if (num2 != 0) {
                   result = num1 / num2; 
                }
                else {
                    System.out.println("Error: Division by zero!");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(1);
        }
        System.out.println("Result:"+ result);
        sc.close();
        
    }
}
