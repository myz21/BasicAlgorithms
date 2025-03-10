import java.util.Scanner;

public class Muhammed_Yildiz_Task1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int operationCount = sc.nextInt();
        
        for (int i = 0; i < operationCount; i++) 
        {

            String operationInput = sc.next();
            sc.nextLine();

            String leftmost = operationInput.charAt(0)+""+operationInput.charAt(1);
            String rightmost = operationInput.charAt(1)+""+operationInput.charAt(2);
            
            if(operationInput.charAt(0)=='A' ^ operationInput.charAt(2) =='A')
            {
                if((rightmost.equals("**"))^(leftmost.equals("**")))
                {
                    A = A*A;
                }
                else if((rightmost.equals("++"))^(leftmost.equals("++")))
                {
                    A = A + 1;
                }
                else if((rightmost.equals("--"))^(leftmost.equals("--")))
                {
                    A = A - 1;
                }
               
            }
           
            else
            {
                continue;
            }
        }
        System.out.println(A);
    }
}
