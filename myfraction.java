import java.util.Scanner;

public class myfraction
{
    /* Program that prompts for and reads the numerator and denominator of a fraction as integers then prints the decimal equivalent of the fraction
     
    
    */
      public static void main(String[] args)
    { 
        int numerator;
        int denominator;
        double decimalvalue;

        
            Scanner myFraction = new Scanner(System.in);
            System.out.println("Enter the numerator");
            numerator = myFraction.nextInt();

            
            System.out.println("Enter the denominator");
            denominator = myFraction.nextInt();

            decimalvalue = numerator/denominator;
            
            System.out.println("numerator/denominator" + " " + decimalvalue );
           
            
    

    }

}

