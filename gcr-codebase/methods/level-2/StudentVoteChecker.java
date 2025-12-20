//Create a class StudentVoteChecker to check voting eligibility of students.
import java.util.*;
public class StudentVoteChecker {

    //Method to check if a student can vote
    public static boolean canStudentVote(int age) {

        //Check voting eligibility
        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //array to store age of 10 students
        int[] ages = new int[10];

        //take input and check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            ages[i] = input.nextInt();

            boolean canVote = canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Invalid age entered");
            } else if (canVote) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }
    }
}
