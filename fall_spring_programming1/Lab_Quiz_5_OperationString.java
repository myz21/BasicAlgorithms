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
public class Lab_Quiz_5_OperationString {
    public static void applyOperation(String operation){

    
    char operator = ' ';
   
    if (operation.contains("+")) 
       operator = '+';
    else if (operation.contains("-")) 
       operator = '-';
    else if (operation.contains("*")) 
       operator = '*';
    else if (operation.contains("/")) 
       operator = '/';
    
    int opIndex= operation.indexOf(operator);
    String firstElement = operation.substring(0,opIndex);
    String secondElement = operation.substring(opIndex+1);
    
    double first = Double.parseDouble(firstElement);
    double second = Double.parseDouble(secondElement);
    
    double result=0;
    
    boolean operatorCheck = false;
    switch(operator){
        case('+'):
            result = first + second;
            break;
        case('-'):
            result = first - second;
            break;
        case('*'):
            result = first * second;
            break;
        case('/'):
            if (second==0) {
                System.out.println("Division by zero error");
                System.exit(0);
            }
            result = first / second;
            break;
    }
    System.out.printf("The output is: %.5f\n",result);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the operation: ");
    
    String operation = sc.next();
    applyOperation(operation);
    
    
    }
}
