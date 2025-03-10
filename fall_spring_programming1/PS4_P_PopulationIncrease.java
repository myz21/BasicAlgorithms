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
public class PS4_P_PopulationIncrease {
    public static void estimatedPopulation(double year){
        double firstPop = 6;
        double estimatedPop = 0;
        if (year >= 2004 && year <= 2050) { 
        if (year>=2004 && year<=2014) {
            estimatedPop = firstPop*Math.pow(1.03,year-2004);
        }
        else if (year>2014) {
            estimatedPop = firstPop*Math.pow(1.05,year-2004);
        }
        System.out.printf("Estimated population for year %.0f is %.2f billion.\n",year, estimatedPop);
        }
        else {
        System.out.println("Please enter a year between 2004 and 2050.");
        }
    }
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        double year = scanner.nextDouble();
        estimatedPopulation(year);
        scanner.close();
    }

}
