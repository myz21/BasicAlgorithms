/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_CheckPalindrome {
    public static boolean palindrome(String str, int low, int high){
        if (low>=high) {
            return true;
        }
        else if(str.charAt(low)!=str.charAt(high)){
            return false;
        }
          return palindrome(str, low+1,high-1);
    }
    public static boolean palindrome(String str){
        return palindrome(str,0,str.length()-1);
    }
    public static void main(String[] args){
        System.out.println(palindrome("mahallaham"));
    }

}
