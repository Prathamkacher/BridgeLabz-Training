//Create a class PowerOfNumber to find the power of a number using a for loop.
import java.util.*;
public class PowerOfNumber {
    public static void main(String args[]) {

        //Create variables to read number and power
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        //Check for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter a positive number and a non-negative power");
        } else {

            //Initialize result
            int result = 1;

            //Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            //Print the result
            System.out.println(
                number + " raised to the power " + power + " is " + result
            );
        }
    }
}
