//Create a class IsEligible to check whether a person is eligible to vote or not.
import java.util.*;
public class IsEligible {
    public static void main(String[] args) {

        //Create variables to read input
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        //Check if person can vote and then print the output.
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }
    }
}
