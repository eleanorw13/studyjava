public class average
{
    //-----------------------------------------------------------------
    //  Prints the average number of three integers.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        int final_grade = 90 ;
        int midterm_grade = 65 ;
        int project_grade = 60 ;
        int class_average = (final_grade + midterm_grade + project_grade )/ 3 ;
        System.out.println("Average for this class " + class_average);
    }
}
