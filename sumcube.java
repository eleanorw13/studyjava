import java.util.Scanner;

public class sumcube {

/*
 Program that prints the sum of cubes. prompts for and read two integers values
 and prints the sum of each value raised to the third power.
 */

    public static void main(String[] args) {

        double num1, num2, val1, val2; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for first integer");
        num1 = scan.nextInt();
        System.out.println("Enter value for second integer");
        num2 = scan.nextInt();

        val1 = Math.pow(num1, 3);
        val2 = Math.pow(num2, 3);

        System.out.println("First Integer Value raised to third power is:" + val1);
        System.out.println("Second Integer Value raised to third power is:" + val2);
        
        System.out.println("the sum of each value raised to the third power is:" + (val1+val2));
    }

}
