//Create a class VotingEligibility to check voting eligibility of 10 students.
import java.util.*;
public class VotingEligibility {
    public static void main(String[] args) {

        //Create an array to store ages of 10 students and read the input
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            age[i] = input.nextInt();
        }

        //Check voting eligibility for each student
        for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Invalid age");
            } else if (age[i] >= 18) {
                System.out.println(
                    "The student with the age " + age[i] + " can vote"
                );
            } else {
                System.out.println(
                    "The student with the age " + age[i] + " cannot vote"
                );
            }
        }
    }
}
