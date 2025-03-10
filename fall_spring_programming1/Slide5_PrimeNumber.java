/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fall_spring_113;

/**
 *
 * @author zer3
 */
public class Slide5_PrimeNumber {
    public final static int LINE_COUNT = 10;
    public static void printPrimeNumbers(int numberOfPrimes){
        
        int count = 0;
        int number = 2;
        while(count<numberOfPrimes){
            boolean primeCheck = true ;
            for (int i = 2; i <=number/2; i++) {
                if ( number%i == 0 ) {
                    primeCheck = false;
                    break;
                }
            }
            if (primeCheck==true) {
                count++;
                if (count%LINE_COUNT==0) {
                    System.out.printf("%5d \n",number);
                }
                else
                    System.out.printf("%5d ",number);
            
            }
            
            
            number++;
        }
    }
    public static void main(String[] args){
        printPrimeNumbers(50);
    }
}
