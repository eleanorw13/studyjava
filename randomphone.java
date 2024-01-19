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


     e
    int phoneareacode, phonepart_2, phonepart_3;
    
    
    phoneareacode = generator.nextInt(700) + 100;
    
    phonepart_2 = generator.nextInt(654) + 100;
  
    phonepart_3 = generator.nextInt(9000) + 1000;

    System.out.println("New Phone number is:" + phoneareacode + "-" + phonepart_2 + "-" + phonepart_3 );
    
    //System.out.println("area code:" + phoneareacode  );
    //System.out.println("phone number:" + phonepart_2 + "-" + phonepart_3   );

    }

    
   

}