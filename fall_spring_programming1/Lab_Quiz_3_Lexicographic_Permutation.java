/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */

public class Lab_Quiz_3_Lexicographic_Permutation {
    public static int count  = 0;
    public static void lexicographicPermutation(String str1, String newString ){
        if (newString.length()== str1.length()){
            System.out.print(newString+ " ");
            count++;
            if(count % 10 == 0)
                System.out.println("");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            lexicographicPermutation(str1, newString+str1.charAt(i));
        }
    }
    public static void lexicographicPermutation(String str1){
        lexicographicPermutation(str1, "");
    }
    public static void main(String[] args) {
        String s = "ABC";
        lexicographicPermutation(s);
    }
}
