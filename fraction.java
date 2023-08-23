import java.util.Scanner;

public class fraction
{
    /* Program that prompts for and reads the numerator and denominator of a fraction as integers,
    then prints the decimal equivalent of the fraction
     
   
    */
      public static void main(String[] args)
    { 
        int numerator;
        int denominator;
        float myResult;
    
            Scanner myNum = new Scanner(System.in);
            System.out.println("Enter numerator");
            numerator = myNum.nextInt();
            
            Scanner myDenom = new Scanner(System.in);
            System.out.println("Enter denominator");
            denominator = myDenom.nextInt();
            
            myResult = numerator / denominator;

            System.out.println(" " + " " + myResult  );
           

    }

}
