import java.util.Scanner;

public class arithmetic
{
    //-----------------------------------------------------------------
    //  Prints the sum, difference, product number of three integers.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int FirstNum;
        int SecondNum;
        int ThirdNum;
       
    
        Scanner MyNumber = new Scanner(System.in);

        System.out.println("Enter First Number");
        FirstNum = MyNumber.nextInt();
        System.out.println("Enter Second Number");
        SecondNum = MyNumber.nextInt();
        System.out.println("Enter Third Number");
        ThirdNum = MyNumber.nextInt();

        System.out.println("summation is: " + (FirstNum+SecondNum+ThirdNum));
        System.out.println("difference: " + (FirstNum-SecondNum-ThirdNum));
        System.out.println("product: " + (FirstNum*SecondNum*ThirdNum));
    }
}