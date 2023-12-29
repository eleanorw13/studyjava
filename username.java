import java.util.Scanner;
import java.util.Random;

public class username
{
    /*-----------------------------------------------------------------
     Program that prompts for and reads the user's first and last name separately. 
     Then print a string composed of the first letter of the user's first name, 
     followed by the first five characters of 
     the user's last name, followed by a random number in the range 10 to 99.
     Assume that the last name is at laset five letters long. 
     Similar algorithms are sometimes used to generate usernames for new computer accounts.
    */-----------------------------------------------------------------
    public static void main(String[] args)
    {
        Random generator = new Random();
        String userfirstname;
        String userlastname;
        int usernumber;
       
        Scanner scan = new Scanner(System.in);
        usernumber = generator.nextInt();
        
        System.out.print("What is your first name?");
        userfirstname = scan.nextLine();
        System.out.println("What is your last name?");
        userlastname = scan.nextLine();
        
       
        System.out.println(" First Name is: " + userfirstname );
        System.out.println(" Last  Name is: " + userlastname );
        System.out.println("New User First name is " + userfirstname.charAt(1) );
        System.out.println("New User Last name is " + userlastname.substring(1,5) );
        System.out.println("Random number is:" + usernumber);
    }
        
    
}
