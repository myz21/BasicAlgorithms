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
public class Slide3_SwitchForLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an uppercase letter: ");
        char ch = sc.next().charAt(0);
        
        int number = 0;
        switch(ch){
            case 'A':
            case 'B':
            case 'C':    
                number = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                number = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                number = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                number = 5; 
                break;
            case 'M':
            case 'N':
            case 'O':
                number = 6;
                break;    
            case 'P':
            case 'Q':
            case 'R':
            case 'S':    
                number = 7;
                break;    
            case 'T':
            case 'U':
            case 'V':
                number = 8;
                break;     
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':    
                number = 9;
                break;
            case ' ':
                number = 1;
                break;  
            default:
                System.out.println(ch+ " is an invalid input.");
                System.exit(1);
        }
        System.out.println("The corresponding number is "+number);
        System.out.println("Enter a string: ");
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("The last character is " + str.charAt(str.length()-1));
    }
}                
