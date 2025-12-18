//Create a class QuotientAndRemainder to find quotient and remainder of two numbers.
import java.util.*;
public class QuotientAndRemainder {
    public static void main(String[] args) {

        //Create variables to read two numbers and calculate quotient and remainder
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Print statement for output
        System.out.println(
            "The Quotient is " + quotient + " and Reminder is " + remainder +
            " of two number " + num1 + " and " + num2
        );
    }
}
