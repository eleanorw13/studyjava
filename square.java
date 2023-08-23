import java.util.Scanner;

public class square
{
    /* Program that prompts for and reads an integer representing the length of a square's side,
    then  prints the square's perimeter and area
     
    perimeter = 4 * side
    area = side * side
    */
      public static void main(String[] args)
    { 
        int side;
        int perimeter;
        int area;

        
            Scanner mySquare = new Scanner(System.in);
            System.out.println("Enter the length");
            side = mySquare.nextInt();
            
            perimeter = 4 * side;
            area = side * side;


            System.out.println("Perimeter of Square is" + " " + perimeter);
           
            System.out.println("Area of Square is" + " " + area);
    

    }

}
