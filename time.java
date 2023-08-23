import java.util.Scanner;

public class time
{
    /* Program that reads values representing a time duration in hours, minutes, 
    and seconds, and then prints the equivalent total number of seconds.
    1 minute = 60 seconds
    1 hour = 60 minute
    60 minute = 3600 seconds
    */
      public static void main(String[] args)
    { 
        int hour;
        int minutes;
        int second;
        int total_seconds;

            Scanner myHour = new Scanner(System.in);
            System.out.println("Enter Hour");
            hour = myHour.nextInt();
            
          
            Scanner myMinutes = new Scanner(System.in);
            System.out.println("Enter minutes");
            minutes = myMinutes.nextInt(); 
            
            Scanner mySecond = new Scanner(System.in);
            System.out.println("Enter Seconds");
            second = mySecond.nextInt(); 

        
            total_seconds = (hour * 3600) + (minutes * 60) + second; 
            
            
        
        System.out.println(hour +"hour" + minutes+"minutes" + second + "seconds");
        System.out.println("Travel Time" + total_seconds + " seconds");

    }

}
