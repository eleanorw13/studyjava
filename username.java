import java.util.Scanner;
import java.util.Random;

public class username
{
    /*-----------------------------------------------------------------
     Program that prompts for and reads the user's first and last name separately. 
     Then print a string composed of the first letter of the user's first name, 
     followed by the first five characters of 
     the user's last name, followed by a random number in the range 10 to 99.
     Assume that the last name is at least five letters long. 
     Similar algorithms are sometimes used to generate usernames for new computer accounts.
    */
    
    public static void main(String[] args)

    {
        Random generator = new Random();
        
        String userfirstname;
        String userlastname;
        int usernumber;
       
        Scanner scan = new Scanner(System.in);
        usernumber = generator.nextInt((0) + 99);
        
        System.out.print("What is your first name?");
        userfirstname = scan.nextLine();
        System.out.println("What is your last name?");
        userlastname = scan.nextLine();
        
        String newfirst = userfirstname.substring(0,1);
        String newlast = userlastname.substring(0,5) ;
       
        System.out.println(" First Name is: " + userfirstname );
        System.out.println(" Last  Name is: " + userlastname );
        //System.out.println("New User First name is " + userfirstname.charAt(0) );
       // System.out.println("New User Last name is " + userlastname.substring(0,5) );
        System.out.println("Random number is:" + usernumber );

        System.out.println("New Username:" + newfirst + newlast + usernumber);
     
    }
        
    
}
