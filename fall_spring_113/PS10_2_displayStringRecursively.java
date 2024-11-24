/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class PS10_2_displayStringRecursively {

    public static void displayRecursively(String str, int start, int end) {
        if (start < end) {
            System.out.println(str.substring(start, end));
            displayRecursively(str, start + 1, end);
        }

    }

    public static void displayRecursivelyy(String str, int start, int end) {
        if (start < end) {
            System.out.println(str.substring(start, end));
            displayRecursively(str, start + 1, end-1);
        }

    }

    public static void main(String[] args) {
        String str = "THE EXAM";
        String str2 = "THE EXAM IS VERY EASY";
        displayRecursively(str, 0, str.length());
        displayRecursivelyy(str2, 0, str2.length());
    }
}
