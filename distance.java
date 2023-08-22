import java.util.Scanner;

public class distance
{
    /* Program that prompts users for and reads integer values for speed and distance traveled then prints the time required for trip as a floating point result
    time traveled = distance traveled / rate 
    distance = speed x time
    */
      public static void main(String[] args)
    { 
        int rate;
        int distance_traveled;
        float travel_time;

            Scanner RateTravel = new Scanner(System.in);
            System.out.println("What is the speed traveled?");
            rate = RateTravel.nextInt();
            

            Scanner myDistance = new Scanner(System.in);
            System.out.println("What is the distance traveled");
            distance_traveled = myDistance.nextInt();
        
            travel_time = distance_traveled / rate;
        

        System.out.println("Travel Time" + travel_time + " Hours");

    }

}
