import java.util.Scanner;

public class reversetime
{
    /* Program that reads values representing a time in seconds then print the 
    equivalent amount of time as combination of hours, minutes and seconds.
    1 minute = 60 seconds
    1 hour = 60 minute
    60 minute = 3600 seconds
       

    */
      public static void main(String[] args)
    { 
        float hour;
        float minutes;
        float second;
        //int total;

           
            Scanner mySecond = new Scanner(System.in);
            System.out.println("Enter Seconds");
            second = mySecond.nextInt(); 

             

            minutes =  second/60;
            hour = minutes/60; 
        
        System.out.println(hour + "hour");
        System.out.println(minutes + "minutes");
        //System.out.println(second + "seconds");
       
    }

}
