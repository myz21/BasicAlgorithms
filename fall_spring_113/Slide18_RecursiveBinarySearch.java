/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide18_RecursiveBinarySearch {
    public static int recursiveSearch(int[] arr, int key ,int low, int high){
        if(low>high)
            return -low-1;
        int mid = (int)(low+high)/2;
        if(key==arr[mid])
            return mid;
        else if(key>arr[mid])
            return recursiveSearch(arr, key, mid+1, high);
        else
            return recursiveSearch(arr, key, low, mid-1);
    }
    public static int recursiveSearch(int[] arr, int key){
        return recursiveSearch(arr, key,0, arr.length-1);
    }
    
    public static void main(String[] args) {
        int [] array = {1,3,4,9,13,15,16,17,91};
        System.out.println(recursiveSearch(array,6));
    }

}
