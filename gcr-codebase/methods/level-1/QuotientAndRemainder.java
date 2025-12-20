//Create a class QuotientAndRemainder to find quotient and remainder of two numbers.
import java.util.*;
public class QuotientAndRemainder {

    //Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int num1, int num2) {

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        //Return remainder and quotient
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take inputs
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //Check for division by zero
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed");
            return;
        }

        //Call the method
        int[] result = findRemainderAndQuotient(num1, num2);

        //Display result
        System.out.println(
            "The Quotient is " + result[1] + " and Remainder is " + result[0] +
            " of two number " + num1 + " and " + num2
        );
    }
}
