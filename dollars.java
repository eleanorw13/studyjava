import java.util.Scanner;

public class dollars
{
    /* Program that prompts for and reads a double value representing a monetary value.
    Then determine the fewest number of each bill and coin needed to represent that amount,
    starting with the highest (assume ten dollar bill is the maximum needed)
    
    quarter = 0.25
    dime = 0.10
    nickel = 0.05
    penny = 0.01
    */
      public static void main(String[] args)
    { 
        double ten_dollar = 10.00;
        double five_dollar = 5.00;
        double one_dollar = 1.00;
        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;
        double myCoinJar;

            Scanner myJar = new Scanner(System.in);
            System.out.println("Enter dollar amount $");
            myCoinJar = myJar.nextDouble();

            System.out.println( (int)(myCoinJar/ten_dollar) + "Ten Dollar Bills");
            System.out.println( (int)(myCoinJar/five_dollar) + "Five Dollar Bills");
            System.out.println( (int)(myCoinJar/one_dollar) + "One Dollar Bills");
            System.out.println( (int)(quarter * myCoinJar) + "Quarters");
            System.out.println( (int)(dime * myCoinJar) + "Dimes");
            System.out.println( (int)(nickel * myCoinJar) + "Nickels");
            System.out.println( (int)(penny * myCoinJar) + "Pennies");
        
    

    }

}
