//Create a class FactorialNum to find factorial of a given number using for loop.
import java.util.*;
public class FactorialNumFor {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Check if the num is positive
        if (num < 0) {
            System.out.println("Please enter a positive integer");
        } else {

            //Compute factorial using for loop
            int factorial = 1;
            int counter = 1;
            for (int i = counter; i <= num; i++) {
                factorial *= counter;
                counter++;
            }

            //Print the factorial
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}