/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author zer3
 */
public class Midterm_CountLetter {
    public static int countLetterForFirstElements(char ch, String sectence){
        int counter = 0;
        
        /*if (!(sectence.endsWith("."))) {
            System.exit(0);
        }*/
        
        if ((sectence.toUpperCase()).charAt(0)==Character.toUpperCase(ch)) {
            counter++;    
        }
        
        for (int i = 0; i < sectence.length(); i++) {
            if ((sectence.toUpperCase()).charAt(i)==' '&&(sectence.toUpperCase()).charAt(i+1)==Character.toUpperCase(ch)) {
                counter++;
            }
        }
        return counter;
    }
   
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch;
        String sectence;
        int counter = 0;
        
        do {
        System.out.println("Enter a letter: ");
        ch = sc.nextLine().toLowerCase().charAt(0);
        } while (!Character.isLetter(ch));
        
        do {
        System.out.println("Enter a sectence ends with '.': ");
        sectence = sc.nextLine();  
        } while (!sectence.endsWith("."));
        
        String [] sectenceWords = sectence.split("\\s+");
       
        for (int i = 0; i < sectenceWords.length; i++) {
            if (sectenceWords[i].toLowerCase().charAt(0)==ch) {
                counter++;
            }
        }
        
        System.out.printf("%d words starts with %c.\n",counter,ch);
    }
}
