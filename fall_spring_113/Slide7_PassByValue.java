/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide7_PassByValue {
        public static void main(String[] args) {
            int x = 1; // x represents an int value
            int[] y = new int[10]; // y represents an array of int values
            m(x, y); // Invoke m with arguments x and y
            System.out.println("x is " +x);
            System.out.println("y[0] is "+y[0]);
        }
        
        public static void m(int number, int[] numbers) { 
          number = 1001; // Assign a new value to number 
          numbers [0] = 5555; // Assign a new value to numbers [0]
        }
    }

