import java.util.Scanner;

public class mileskilometer
{
    //Program that converts miles to kilometers (1 miles = 1.60935 km)
    //Reads the miles value from the user
      public static void main(String[] args)
    { 
        final double kilometer = 1.60935;
        double miles;

        try (Scanner usermiles = new Scanner(System.in)) {
            System.out.print("How Many Miles?");
            miles = usermiles.nextDouble();
        }
        miles = kilometer * miles;

        System.out.println(miles + " " +"Kilometer" );

    }

}



