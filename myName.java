import java.util.Scanner;

public class myName
{
    //-----------------------------------------------------------------
    //  Prompts user to read person name, age, college, and pet name.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        String YourName;
        String YourCollege, YourPet;
        int YourAge;
        
        Scanner scan = new Scanner(System.in);

        
        System.out.print("What is your Name?");
        YourName = scan.nextLine();
        System.out.println("What is your College Name?");
        YourCollege = scan.nextLine();
        System.out.println("What is your Pet Name?");
        YourPet = scan.nextLine();
        System.out.print("What is your Age?");
        YourAge = scan.nextInt();
       
        System.out.println("Hello My Name is: " + YourName + " "+ "I am:"+YourAge+ " " + "years" );
        System.out.println("I am enjoying my time at " + YourCollege );
         System.out.println("I miss my pet " + YourPet+ " " + "very much! " );
    }
        
    
}