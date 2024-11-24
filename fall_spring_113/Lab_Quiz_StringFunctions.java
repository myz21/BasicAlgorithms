
package fall_spring_113;


public class Lab_Quiz_StringFunctions {

   //bu soruya yarın bak (13 Nisan)
    public static void main(String[] args) {
        
        String s = "14+0";
        int n =0;
         char c = 'a';
        
         if (s.contains("/")){
        
            System.out.println("the operation is division");
            n = s.indexOf("/");
            c = s.charAt(n);
        }
         else if (s.contains("+")){
        
            System.out.println("the operation is addition");
            n = s.indexOf("+");
            c = s.charAt(n);
        }
       
            double number1 = Double.valueOf(s.substring(0,n));
        
            double number2 = Double.valueOf(s.substring(n+1, s.length()));
        
            double finalAnswer = 0; 
                  
            switch (c) {
                case '/':
                 finalAnswer = number1/number2;
                 if(number2==0)
                    System.out.println("Error:Division by zero");
                 
                 else 
                    System.out.println(finalAnswer);
                 break;
                 case '+':
                  finalAnswer = number1+number2;
                  System.out.println(finalAnswer);
                  break;      
                          
           
        }
            
            
        
                
        
    }
    
}
