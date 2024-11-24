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
public class LabGuide5_EliminateExtras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your string: ");
        String s = sc.nextLine();
        eliminateExtraSpaces(s);
        
    } 
    public static void eliminateExtraSpaces(String str){
        String st2 = str.trim();
        char [] eliminatedCharArray = st2.toCharArray();
        for (int i = 0; i < st2.length(); i++){
            if (eliminatedCharArray[i]==' ') {
                while(eliminatedCharArray[i+1]==' '){
                    i++;
                }
            }
        System.out.print(eliminatedCharArray[i]);
        }
        System.out.println("");
    }
    
}
