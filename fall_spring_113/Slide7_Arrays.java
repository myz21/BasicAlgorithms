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
public class Slide7_Arrays {
    public static void main(String[] args) {
        
        String [] myList = new String[10];
        myList[0]= "ali";
        myList [1]= "\u0000";
        myList[2]= myList[0]+myList[9];
        myList[9] = "veli";
        
        int [] myList2 = new int[5];
        myList2[0] = 1;
        myList2[1] =2;
        myList2[2] = myList2[0]+myList2[1]; 
        
        System.out.println("myList "+Arrays.toString(myList));
        System.out.println(myList.length);
        
        System.out.println("myList2 "+Arrays.toString(myList2));
        
        int [] randomList = new int[10];
        int max = randomList[0];
        
        
        for (int i = 0; i < randomList.length; i++) {
            randomList[i] = (int)(Math.random()*100);
            if(max<randomList[i])
                max = randomList[i];
            System.out.print(randomList[i]+" ");
           
        }
        System.out.println("");
        //Display all elements with foreach loop
        System.out.println("Random list with foreach loop: ");
        for (int value: randomList) {
            System.out.print(value+" ");
        }
        System.out.println("");
        
        //Shifting elements
        System.out.println("Shifting: ");
        int tempp = randomList[0];
        for (int i = 1; i < randomList.length; i++) {
            randomList[i-1]=randomList[i];
        }
        randomList[randomList.length-1] = tempp;
        System.out.println("\nRandom list: ");
        
        for (int i = 0; i < randomList.length; i++) {
            System.out.print(randomList[i]+" ");
        }
        
        int j = 0;
        System.out.println("\nShuffled list:");
        for (int i = 0; i < randomList.length; i++) {
             j = (int) Math.random()*randomList.length;
            int temp = randomList[i];
            randomList[i]=randomList[j];
            randomList[j] = temp;       
            System.out.print(randomList[i]+" ");
        }

        System.out.println("\nMax is: "+max);
        System.out.println("");
        
        System.out.println("\nShifting elements: ");
        
       int temp = randomList[0];
        for (int i = 1; i <randomList.length; i++) {
            randomList[i-1] = randomList[i];
        }
        randomList[randomList.length-1] =temp; 
        System.out.println(Arrays.toString(randomList));
    }
}
