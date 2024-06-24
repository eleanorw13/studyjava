
import java.util.Random;
//import java.util.Scanner;
public class float_to_whole {

    /*
     Program that reads a floating point value (double) and prints the closest whole numbers less
     than and greater than that value. 
     For example, if the number is 28.466, the program would print 28 and 29.
     */

    public static void main(String[] args) {

        Random generator = new Random() ;
        float Number1;
        Number1 = generator.nextFloat() * 30;
       // Scanner MyNumber = new Scanner(System.in);

       // System.out.println("Enter Float Number");
        //Number1 = MyNumber.nextFloat();

       

        System.out.println("largest number is" + " " + ((int)Number1 + 1) ); //increment   
        System.out.println("float number is" + Number1);
        System.out.println("smallest number is" + " " + ((int)Number1 - 1) );  //decrement
       
        
    }

}
