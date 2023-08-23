import java.util.Scanner;

public class coins
{
    /* Program that determines the value of the coins in a jar and prints
    the total in dollars and cents. read the integer values that 
    represent the numbers of quarters, dimes, nickels, and pennies
    
    quarter = 0.25
    dime = 0.10
    nickel = 0.05
    penny = 0.01
    */
      public static void main(String[] args)
    { 
        double quarter;
        double dime;
        double nickel;
        double penny;
        double myCoinJar;

            Scanner myQ = new Scanner(System.in);
            System.out.println("How many quarters?");
            quarter = myQ.nextInt();
            
            Scanner myD = new Scanner(System.in);
            System.out.println("How many dime?");
            dime = myD.nextInt();

            Scanner mynickel = new Scanner(System.in);
            System.out.println("How many nickels?");
            nickel = mynickel.nextInt();

            Scanner myPenny = new Scanner(System.in);
            System.out.println("How many pennies?");
            penny = myPenny.nextInt();
          

            System.out.println(quarter + "Quarters");
            System.out.println(dime + "Dimes");
            System.out.println(nickel + "Nickel");
            System.out.println(penny + "Pennies");
        
            myCoinJar = (quarter * 0.25) + (dime * 0.10) + (nickel * 0.05) + (penny * 0.01); 
            
            System.out.println("My Coin Jar have" + "$" + myCoinJar );
    

    }

}
