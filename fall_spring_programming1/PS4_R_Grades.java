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
public class PS4_R_Grades {
    public static void gradeRanges(int stnum){
    Scanner sc = new Scanner(System.in);
       int a =0, b =0, c = 0; 
       for (int i = 0; i < stnum; i++) {
            String grade = sc.nextLine();
            grade.split(" ");
            int stdGrade = Integer.parseInt(grade);
            
            if(stdGrade>=0 && stdGrade<=39)
                c+=1;
          
            else if(stdGrade>=40 && stdGrade<=69)
                b+=1;
          
            else if(stdGrade>=70 && stdGrade<=100)
                a+=1;
        }
        System.out.printf("The student number in the grade range of 0-39 is %d, 40-69 is %d, 70-100 is %d.\n",c,b,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int stnum = sc.nextInt();
        gradeRanges(stnum);
    }
}
