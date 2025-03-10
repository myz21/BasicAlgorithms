/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Midterm_Trace_Q4 {
     public static void main(String[] args) {
        int count = 1;
        do {
            for (int i = 4; i < 13; i += 8) {
                for (int j = 5; j < 23; j *= i) { // j'yi i ile çarp
                    for (int k = -20; k > -25; k--) {
                        count += 2;
                    }
                }
            }
        } while (count < 40);
        System.out.println(count);
    }
}
