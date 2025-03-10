import java.util.Scanner;

public class Muhammed_Yildiz_Task2 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int decodingCount = sc.nextInt();

        String [] decodedStrings = new String [decodingCount];

        for(int i = 0; i < decodingCount ; i++){
           
            int n = sc.nextInt();

            String encoded = sc.next();
            String reverseDecoded = "";
            String decoded = "";
    
            for(int j = n-1 ; j>=0; j--){
                
                //control if the j-2 greater than 0
                if (j - 2 >= 0 && encoded.charAt(j) == '0')
                {
                    reverseDecoded = reverseDecoded+decodeLetter((String)(encoded.charAt(j-2)+""+encoded.charAt(j-1)+""+encoded.charAt(j)));
                    j-=2; // j should be decremented with 3, it will also decrementing with j--
                    continue;
                }
                
                else if (j >= 0)
                {
                    reverseDecoded = reverseDecoded+decodeLetter((String)(""+encoded.charAt(j)));
                }
                
            }
            
            for(int k = reverseDecoded.length()-1 ; k>=0; k--){
                decoded = decoded+reverseDecoded.charAt(k);
            }
            
            decodedStrings[i] = decoded;
        }

        //Print all of the decoded words
        for(int i = 0; i < decodingCount ; i++){
            System.out.println(decodedStrings[i]);
        }
     
    }
    
    static char decodeLetter(String encoded){
        
        int encodedInt = 0;

        for(int i=0; i<encoded.length();i++){
            encodedInt = encodedInt * 10 + (encoded.charAt(i) - '0');
            //multiples the number in the first 2 digit with 10 then adds it encodedInt 
        }
        
        if(encodedInt<10)
        {
            return (char) ('a'+encodedInt-1);
        }

        else
        {
            return (char) ('a'+(encodedInt/10)-1);
        }
        
    }

}
