/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author zer3
 */
public class PS6_C_PassTheCourse {
    public static ArrayList<Integer> displayPassedSt (int[][] IdsAndGrades, int studentCount){
        ArrayList<Integer> passedGuys = new ArrayList<>();
        double overall=0;
        for (int i = 0; i < studentCount; i++) {
            overall= 0.3*IdsAndGrades[i][1]+0.3*IdsAndGrades[i][2]+0.4*IdsAndGrades[i][3];
            if(overall>50)
                passedGuys.add(IdsAndGrades[i][0]);
         }
    return passedGuys;
    }
      public static ArrayList<Integer> displayFailedSt (int[][] IdsAndGrades, int studentCount){
        ArrayList<Integer> failedGuys = new ArrayList<>();
        double overall=0;
        for (int i = 0; i < studentCount; i++) {
            overall= 0.3*IdsAndGrades[i][1]+0.3*IdsAndGrades[i][2]+0.4*IdsAndGrades[i][3];
            if(overall<50)
                failedGuys.add(IdsAndGrades[i][0]);
         }
    return failedGuys;
    }
      public static void main(String[] args){
          
          int[][] IdsAndGrades = {{1, 50, 60, 90},{2, 40, 70, 50},{3, 90, 40, 15},{4, 80, 70, 25}};
          int studentCount = IdsAndGrades[0].length;
          System.out.println(displayPassedSt(IdsAndGrades, studentCount));
          System.out.println(displayFailedSt(IdsAndGrades, studentCount));
      }
}
