//Create a class StudentMarksGrade to calculate percentage and grade of students.
import java.util.*;
public class StudentMarksGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //take input for number of students
        int numberOfStudents = input.nextInt();

        //create arrays to store marks, percentage, and grade
        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        //take input for marks with validation
        for (int i = 0; i < numberOfStudents; i++) {

            int p = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();

            //Check for negative marks
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Please enter positive values.");
                i--;
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        //calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {

            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        //print marks, percentage, and grade
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + physics[i] +
                " | Chemistry: " + chemistry[i] +
                " | Maths: " + maths[i] +
                " | Percentage: " + percentage[i] +
                " | Grade: " + grade[i]
            );
        }
    }
}
