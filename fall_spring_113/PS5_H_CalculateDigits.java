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
public class PS5_H_CalculateDigits {
    public static void calculateDigits(int num){
        double sumOfDigits;
        double productOfDigits;
        
        String numToString = Integer.toString(num);
        int numOfDigits = numToString.length();
        
        if (numOfDigits>=4) {
            productOfDigits = calculateProductofDigits(num);
            System.out.printf("Product of digits is %.0f.",productOfDigits);
            return;
        }
        else{
            sumOfDigits = calculateSumofDigits(num);
            System.out.printf("Sum of digits is %.0f.",sumOfDigits);
            return;
        }
    }
    public static double calculateSumofDigits(int num){
        double sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
    return sum;
    }
    public static double calculateProductofDigits(int num){
        double product = 1;
        while(num>0){
            product*=num%10;
            num/=10;
        }
    return product;
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int num;
         do {
             System.out.print("Enter an integer: ");
             num = scanner.nextInt();
        } while (num<0);
         calculateDigits(num);
         double x = 11.6;
         System.out.println("rounded up num is "+Math.rint(x));
    }
}
