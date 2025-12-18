//Create a class BasicCalculator to perform arithmetic operations.
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {

        //Create variables to store two numbers and calculate results
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        //Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print statement for output
        System.out.println(
            "The addition, subtraction, multiplication and division value of 2 numbers " +
            number1 + " and " + number2 + " is " +
            addition + ", " + subtraction + ", " + multiplication + ", and " + division
        );
    }
}






