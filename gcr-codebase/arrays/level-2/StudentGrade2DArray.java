//Create a class StudentGrade2DArray to calculate percentage and grade using 2D array.
import java.util.*;
public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take input for number of students
        int numberOfStudents = input.nextInt();

        //2D array to store marks.
        int[][] marks = new int[numberOfStudents][3];

        //arrays to store percentage and grade
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        //Take input for marks of each student
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextInt();
            }
        }

        //calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            //Determine grade based on percentage
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

        //print results
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + marks[i][0] + " | Chemistry: " + marks[i][1] +
                " | Maths: " + marks[i][2] + " | Percentage: " + percentage[i] +
                " | Grade: " + grade[i]
            );
        }
    }
}
