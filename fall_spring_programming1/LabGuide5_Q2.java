    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

import java.util.Scanner;

/**
 *
 * @author zer3
 */
public class LabGuide5_Q2 {
    public static double studentTution(int year, int credit){
        double tution = 0;
        if (credit>12) {
            tution = 4500 + 750*(credit-12);
        }
        else if(credit<=12){
            tution = credit*525;
        }
        
        if (year ==4) 
            tution = tution*0.85;
            
        return tution;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        if (id ==-1) {
            System.exit(0);
        }
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        System.out.print("Enter credit: ");
        int credit = sc.nextInt();
        
        System.out.printf("Student with id %d will pay %.0f tution. ",id,studentTution(year, credit));
    }

}
