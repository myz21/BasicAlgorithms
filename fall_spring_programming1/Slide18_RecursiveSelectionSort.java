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
public class Slide18_RecursiveSelectionSort {

    public static void iterativeSort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMin(arr, i);
            //char minElement=arr[minIndex];

            if (minIndex != i) {
                swap(arr, minIndex, i);
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static int findMin(char[] arr, int start) {
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        char[] arr = {'u', 't', 'n', 'x', 'c', 's', 'a'};
        //iterativeSort(arr);
        recursiveSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursiveSort(char[] arr, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            char min = arr[low];

            for (int i = low+1; i < high ; i++) {
                if (arr[i] < min) {
                    indexOfMin = i;
                    min = arr[i];
                }
            }
            swap(arr, low, indexOfMin);

            recursiveSort(arr, low + 1, high);

        }
        
    }
    public static void recursiveSort(char [] arr){
        
        recursiveSort(arr,0,arr.length);
                
    }
}
