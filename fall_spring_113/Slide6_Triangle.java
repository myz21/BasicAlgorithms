/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide6_Triangle {
public static void main(String[] args) {
        char x = '*';
        int num  = 5;
        printEmptyTriangle(x,num);
    }
    public static void printBottom(char ch, int width ){
        for (int i = 0; i < width; i++) {
            System.out.print(ch+"");
        }
    }
    public static void printEmptyTriangle(char ch, int height){
        for (int i = 0; i < height-1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0|| i==j ) 
                    System.out.print(ch);
                
                else 
                    System.out.print(" ");  
                
            }
            System.out.println("");
        }
        printBottom(ch, height);
    }
}
