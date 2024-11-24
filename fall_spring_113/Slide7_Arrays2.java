/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;
import java.util.Arrays;
/**
 *
 * @author zer3
 */
public class Slide7_Arrays2 {
   public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[5];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(destinationArray));
   }
   

//System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);

//System.out.println(Arrays.toString(destinationArray)); // Çıktı: [1, 2, 3, 4, 5]

}
