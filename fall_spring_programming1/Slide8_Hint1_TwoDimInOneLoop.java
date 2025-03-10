/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide8_Hint1_TwoDimInOneLoop {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {5, 6, 7, 8},
            {9, 10, 11, 12,21},
            {13, 14, 15, 16,17,18}
        };
        raggedArrInOneLoop(matrix);
    }
    
    public static void arrInOneLoop(int[][] A) {
        int y = A.length;
        int x = A[0].length;
        int columnCount = x;
        int r = 0;
        for (int i = 0; i < x * y; i++) {
            System.out.print(A[r][i % columnCount] + " ");
            if ((i+1) % columnCount == 0) {
                r++;
            }
        }
        System.out.println("");
    }
    public static void raggedArrInOneLoop(int[][] A) {
    //çalısmıyor
    int y = A.length;  // Satır sayısını al
    int r = 0;  // Başlangıç satırı
    int x;
    for (int i = 0; i < 24; i++) {
        x = A[i+1].length;    
        System.out.print(A[r][i % x] + " ");
            if ((i+1) % x == 0) {
                r++;
            }
        }
        System.out.println("");
}

}
