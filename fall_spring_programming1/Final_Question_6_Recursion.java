/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Final_Question_6_Recursion {
    public static int result = 0;
    static boolean meth(int[] arr, int n, int one, int two){
        System.out.printf("meth(%d,%d,%d) and result is %d\n",n,one,two,result);
        if(two == 3 && one == 0){
            return true;
        }
        if(two ==3 || n == 0 || one<0){
            return false;
        }
        result+=n;
        return meth(arr, n-1,one -arr[n-1],two+1)||meth(arr, n-1,one,two);
    }
    public static void main(String[] args) {
        int [] nums = {2,7,4,0,9,5,1,3};
        
        if(meth(nums, nums.length, 6,0)){
            System.out.println(result+5);
        }
        else{
            System.out.println(result+10);
        }
        System.out.println(result);
    }
}
