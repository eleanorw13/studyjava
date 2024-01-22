import java.util.Scanner;

public class average
{
    //-----------------------------------------------------------------
    //  Prints the average number of three integers.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int final_grade;
        int midterm_grade;
        int project_grade;

        Scanner MyGrade = new Scanner(System.in);
        System.out.println("Enter Final Grade");
        final_grade = MyGrade.nextInt();

        System.out.println("Enter Midterm Grade");
        midterm_grade = MyGrade.nextInt();

        System.out.println("Enter Final Project Grade");
        project_grade = MyGrade.nextInt();

        int class_average = (final_grade + midterm_grade + project_grade )/ 3 ;

        System.out.println("Final Grade is " + final_grade);
        System.out.println("Midterm Grade is " + midterm_grade);
        System.out.println("Project Grade is " + project_grade);

        System.out.println("Average for this class " + class_average);
    }
}
