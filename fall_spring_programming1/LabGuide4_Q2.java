/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fall_spring_113;
import java.util.Scanner;
/**
 *
 * @author zer3
 */
public class LabGuide4_Q2 {

   
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in); 
    int lowerCount = 0;
    int upperCount = 0;
    int digitCount = 0;
    char ch; 
   System.out.println("Enter characters. If you wanna stop, press '*' : ");
  
   while(true){
   ch = sc.next().charAt(0);
        if (ch == '*'){
        break;
        }
        if(ch>='a' && ch<='z'){
            lowerCount++;
        }
        else if(ch>='A' && ch<='Z'){
            upperCount++;
        }
        else if(ch< 'a' && ch != '*'){
            digitCount++;
        }
   } 
   System.out.printf("There are %d uppercase, %d lowercase and %d letters.",upperCount,lowerCount,(digitCount));
  }  
}