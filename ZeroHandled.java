/*ZeroHandled.java
Derived from java foundations text
*/


import java.util.Scanner;


public class ZeroHandled
{
   //-----------------------------------------------------------------
   //  Deliberately divides by zero to produce an exception.
   //-----------------------------------------------------------------
    public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);
    
        int numerator = 10;
        int denominator = 0;
        
          
        while( numerator!=-2 ){
        
            try{
                System.out.println("Entering -2 for the numerator will terminate program.");
                
                System.out.println("Please enter numerator.");
                    numerator = scan.nextInt();
                    
                System.out.println("Please enter denominator.");
                    denominator = scan.nextInt();
                    
                  int integer = numerator / denominator;
                  
                  System.out.println((double) integer);
                }
            catch(ArithmeticException e){
                System.out.println("Number inputted is not valid");
            }
            
       }
    
    }
}
		
