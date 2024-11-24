/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class PS5_Y_PopulationDouble {
    public static void organismPopulation(long firstPop,long destinationPop){
       
       double daysForFirst = (Math.log(firstPop)/Math.log(2));
       double daysForDestination = (Math.log(destinationPop)/Math.log(2));         
       double totalDurationForReach = daysForDestination-daysForFirst;
       int daysForReach =(int)(totalDurationForReach);
       double hoursForReach= (totalDurationForReach-daysForReach)*24;
        System.out.printf("Student reached the population for %d days and %.0f hours.\n",daysForReach,hoursForReach);
    }
    public static void main(String[] args){
        organismPopulation(2,1543);
    }
}
