//Create a class StudentGrade to calculate percentage, grade, and remarks.
import java.util.*;
public class StudentGrade {
    public static void main(String[] args) {

        //Create variables to read marks of 3 subjects
        Scanner input = new Scanner(System.in);
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        //Calculate total and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3;

        String grade;
        String remarks;

        //calculate grade and remarks based on percentage
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        //Print output
        System.out.println(
            "Average Percentage: " + percentage + "%\n" +
            "Grade: " + grade + "\n" +
            "Remarks: " + remarks
        );
    }
}
