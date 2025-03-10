
package fall_spring_113;
import java.util.Scanner;

public class PbSet_7_3_K_CompareSectences {
    public static void sentence (String firstSentence, String secondSentence){
       
        int upperFirst = 0;
        int upperSecond= 0;
        int indexOfUpperSecond;
        if (firstSentence.endsWith("?")&& secondSentence.endsWith(".")) 
        {
            for (int i = 0; i < firstSentence.length(); i++) {
                if (firstSentence.charAt(i) >= 'A' && firstSentence.charAt(i)<='Z') {
                    upperFirst++;
                }
                else if (secondSentence.charAt(i) >= 'A' && secondSentence.charAt(i)<='Z') {
                    upperSecond++;
                }
             }   
       }
       else          
       {
         System.exit(1);
       }
            if (upperSecond>upperFirst) {
                System.out.println("We'll print second sentence: "+secondSentence);
            }
            else if(upperFirst>upperSecond){
                System.out.print("We'll print reverse order of second sentence: ");
                for (int i = secondSentence.length()-1; i >= 0; i++) {
                    System.out.print(secondSentence.charAt(i));
                }
                System.out.println("");
            }
            else{
                for (int i = 0; i < firstSentence.length(); i++) {
                if (secondSentence.charAt(i) >= 'A' && secondSentence.charAt(i)<='Z') {
                    System.out.println("In second sentence, index of uppercase "+(secondSentence.charAt(i))+" is "+(i+1));;
                }
                }
                }
    }
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.print("Enter your first sentence: ");
         String firstSentence = sc.nextLine();
         sc.nextLine();
         System.out.print("Enter your second sentence: ");
         String secondSentence = sc.nextLine();
         
         compareSentences(firstSentence, secondSentence);
         sc.close();
         //sentence(firstSentence, secondSentence);
     }
     public static void compareSentences(String firstSentence, String secondSentence) {
        int upperFirst = 0;
        int upperSecond = 0;

        if (firstSentence.endsWith("?") && secondSentence.endsWith(".")) {
            for (int i = 0; i < firstSentence.length(); i++) {
                char ch1 = firstSentence.charAt(i);
                char ch2 = secondSentence.charAt(i);

                if (Character.isUpperCase(ch1)) {
                    upperFirst++;
                }
                if (Character.isUpperCase(ch2)) {
                    upperSecond++;
                }
            }

            if (upperSecond > upperFirst) {
                System.out.println("We'll print second sentence: " + secondSentence);
            } else if (upperFirst > upperSecond) {
                System.out.print("We'll print reverse order of second sentence: ");
                for (int i = secondSentence.length() - 1; i >= 0; i--) {
                    System.out.print(secondSentence.charAt(i));
                }
                System.out.println();
            } else {
                for (int i = 0; i < secondSentence.length(); i++) {
                    if (Character.isUpperCase(secondSentence.charAt(i))) {
                        System.out.println("In second sentence, index of uppercase '" + secondSentence.charAt(i) + "' is " + (i + 1));
                    }
                }
            }
        } else {
            System.out.println("Sentences should end with '?' and '.' respectively.");
        }
    }
}
