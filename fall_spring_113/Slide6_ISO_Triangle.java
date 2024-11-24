/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide6_ISO_Triangle {
    public static void printSpace(int height){
        for(int k = 1 ; k<=height ; k++){
            System.out.print(" ");
        }
    }
    public static void printISOTriangle(int height){
        for (int i = 1; i <= height; i++) {
          printSpace(height-i);
            for (int j = 1; j <= 2*i-1; j+=1) {
                System.out.print("*");
            }
            System.out.println("");
    
        }
        
    }
    public static void main(String[] args) {
        int h = 5;
        printISOTriangle(h);
    }
}
