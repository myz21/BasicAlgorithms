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
public class OnPaperQuiz_1 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = "aybu";
        String str3 = new String("aybu");
        String str4 = "a";
        char myCh = 'Y';
        
        str4.concat("ybu");
        
        if (str2 == str3) {
            myCh++;
        }else{
            myCh--;
        }

        System.out.print(str4);
        
        switch (myCh) {
            case 'X': str4 = str1.toLowerCase(); 
            case 'Z': str4 = str1.toUpperCase(); 
            break;
        }
        
        System.out.println(str4.substring(1, 3) + str1.charAt(3));
    }
}
