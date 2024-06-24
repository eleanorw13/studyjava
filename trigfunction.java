
import java.util.Random;
//import java.util.Scanner;
public class trigfunction {

    /*
    Program that generates a random integer in the range 20 to 40 inclusive
    and displays the sine, cosine, and tangent of that number
     */

    public static void main(String[] args) {

        Random generator = new Random() ;
        int Number1;
        Number1 = generator.nextInt(20) + 20;
     

       

        System.out.println(" random number between 20 and 40" + " " ); 
        System.out.println( Number1 ); 
       
        System.out.println( "SINE" + Math.sin(Number1) ); 
        System.out.println( "COSINE" + Math.cos(Number1) ); 
        System.out.println( "TANGENT" + Math.tan(Number1) ); 
    }

}
