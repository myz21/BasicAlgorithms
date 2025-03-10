/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide7_LinearSearch {
     public static int linearSearch(int[] list, int key){
         for (int i = 0; i < list.length; i++) {
             if(key == list[i]){
                 return i;
             }
             
         }
         return -1;
     }
     public static int binarySearch(int[] list, int key){
         int low = 0;
         int high = list.length;
         int mid;
         while(low<=high){
             mid = (int)(low+high)/2;
             if (key == list[mid]) {
                 return mid;
             }
             else if (key<list[mid]) {
                 high = mid-1;
             }
             else {
                 low = mid+1;
             }
         }
         return -low-1;
     }
    public static void main(String[] args) {
      int [] list = {1,3,5,7,9,11,14};
        System.out.println(linearSearch(list, 7));
        System.out.println(binarySearch(list,8));
    }
}
