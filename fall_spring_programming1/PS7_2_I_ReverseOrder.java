/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author zer3
 */
public class PS7_2_I_ReverseOrder {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter characters: ");
        ArrayList<Character> charList = new ArrayList<>();
         char ch;
         do {
             ch = sc.next().charAt(0);
             charList.add(ch);
         } while (ch != '&');
         
         sc.close();
         
         if (charList.contains('%')) 
         {
             for (int i = charList.size()-1; i >=0; i--) {
                 System.out.println(charList.get(i));
             }
         }
         else 
         {
         for (int i = 0; i < charList.size(); i++) {
             System.out.println(charList.get(i));
             }
         }
         
         
         
     }
}
