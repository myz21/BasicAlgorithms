package fall_spring_113;
import java.util.Scanner;

public class PBSet_Trace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = -5;
        if (a > 0)
            if (a < 40)
                System.out.printf("\nYES");
        else
            System.out.printf("\nNO");
        System.out.printf("\n%d", a);
        
        
        
        
        /*double a = 0, k = 0, z = 0;

        System.out.print("Enter two numbers (space separated): ");
        k = scanner.nextDouble();
        a = scanner.nextDouble();

        if (a > 0 && k > 0) {
            a = a + k;
        } else if (k == 0) {
            z = a;
            a = k;
            k = z;
        } else if (a < 0) {
            a = a + 1;
        } else {
            k = k * 2;
        }

        System.out.printf("%.2f %.2f", a, k);

        scanner.close();*/
    }
}
