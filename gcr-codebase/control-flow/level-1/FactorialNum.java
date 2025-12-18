//Create a class FactorialNum to find factorial of a given number using while loop.
import java.util.*;
public class FactorialNum {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Check if the num is positive
        if (num < 0) {
            System.out.println("Please enter a positive integer");
        } else {

            //Compute factorial using while loop
            int factorial = 1;
            int counter = 1;
            while (counter <= num) {
                factorial *= counter;
                counter++;
            }

            //Print the factorial
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}
