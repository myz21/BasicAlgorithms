/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide5_İsPalindrome {
    public static void isPalindrome(String str){
        int first = 0;
        int last = str.length()-1;
        boolean isPalindromeCheck = true;
        while(first<last){
            if (str.charAt(first)!=str.charAt(last)) {
                isPalindromeCheck = false;
                break;
            }
            first++;
            last--;
        }
        if (isPalindromeCheck) {
            System.out.println(str+" is palindrome.");
        }
        else
            System.out.println(str+" is not palindrome.");
    }
    public static void main(String[] args){
        isPalindrome("asdfghgfdsa");
    }
}
