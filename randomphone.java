import java.util.Scanner;
import java.util.Random;

public class randomphone {


    public static void main(String[] args){

        /* Program that creates and prints a random phone number of the form xxx-xxx-xxxx
        Include the dashes in the output. 
        Do not let the first three digits contain 8 or 9 (but don't be more restrictive than that)
        and make sure that the second set of three digits is not greater than 655
        Hint: Think through the easiest way to construct the phone number
        Each digit does not have to be determined separately.
        */


    int phoneareacode, phonepart_2, phonepart_3;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 3 digits for the Area Code");
    phoneareacode = scan.nextInt();
    System.out.println("Enter 3 digits for phone number");
    phonepart_2 = scan.nextInt();
    System.out.println("Enter 4 digits for phone number");
    phonepart_3 = scan.nextInt();

    System.out.println("New Phone number is:" + phoneareacode + "-" + phonepart_2 + "-" + phonepart_3 );


    }

    
   

}