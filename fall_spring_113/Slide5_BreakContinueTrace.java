/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide5_BreakContinueTrace {
    public static void main(String[] args) {
    int val = 10;
    do {
        while (true) {
            val--;
            if (++val == 10 | val--== 10) {
                continue;
               }
               break;
            }
            val--;
            break;
        } while (true);
        
    int count = 0;

    for (int i = 0; i < 12; i+= 6) {

        for (int j= 20; j > 5; j = 2) {

            if (j == 10) {

                continue;

            }

            for (int k= 6; k < val; k++) {

                count++;

            }

        }

    }

    System.out.println(count);
}
}

