import java.util.Scanner;



public class CelciusTempConvert
{
    //-----------------------------------------------------------------
    //  Computes the Fahrenheit equivalent of a specific Celsius
    //  value using the formula F = (9/5)C + 32.
    
    // Compute Fahrenheit to Celcius prompt user to enter Fahrenheit
    // Formula C = (F - 32) * 5/9
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;

        double fahrenheitTemp;
        double celciusTemp;
      
        Scanner myTemp = new Scanner(System.in);
    
        
        System.out.print("Enter Fahrenheit:");
        fahrenheitTemp = myTemp.nextDouble();
        
        //System.out.print("Enter Celcius:");
        //celciusTemp = myTemp.nextDouble();

        celciusTemp = (fahrenheitTemp - BASE) * (5.0/9.0);

        //fahrenheitTemp = celciusTemp * CONVERSION_FACTOR + BASE;
        
        System.out.println("Celcius Equivalent:" + celciusTemp);
        //System.out.println("Fahrenheit Equivalent:" + fahrenheitTemp);

        
    }
}
