//Create a class AbundantNumber to check if a number is an Abundant Number.
import java.util.*;
public class AbundantNumber {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Check if number is not positive integers
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
			//Initialize sum of divisors
			int sum = 0;
            //Find all divisors
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum = sum + i;
                }
            }

            //Check Abundant Number condition and print the output.
            if (sum > number) {
                System.out.println(number + " is an Abundant Number");
            } else {
                System.out.println(number + " is not an Abundant Number");
            }
        }
    }
}
