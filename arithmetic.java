import java.util.Scanner;

public class arithmetic
{
    //-----------------------------------------------------------------
    //  Prints the sum, difference, product number of three integers.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        float FirstNum;
        float SecondNum;
       
    
        Scanner MyNumber = new Scanner(System.in);

        System.out.println("Enter First Number");
        FirstNum = MyNumber.nextFloat();
        System.out.println("Enter Second Number");
        SecondNum = MyNumber.nextFloat();

        
        System.out.println("summation is: " + (FirstNum+SecondNum));
        System.out.println("difference: " + (FirstNum-SecondNum));
        System.out.println("product: " + (FirstNum*SecondNum));
    }
}