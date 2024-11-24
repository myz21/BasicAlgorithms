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
public class Slide7_SelectionSort {
    public static int findMinIndex(int [] arr, int start){
        
        int currentMinIndex = start;
        
        for (int i = start+1; i < arr.length; i++) {
            if (arr[i]<arr[currentMinIndex]) {
                currentMinIndex = i;
            }
   
        }
        return currentMinIndex;
    }
    public static void swap(int []arr, int n1, int n2){
        
        int temp = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
    public static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int currentMinIndex = findMinIndex(arr, i);
            //int currentMin = arr[currentMinIndex];
            
            if (currentMinIndex != i) {
                swap(arr, currentMinIndex, i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] arr = {1,90,2,66,10,65,31,56,65};
        selectionSort(arr);
    }
}
