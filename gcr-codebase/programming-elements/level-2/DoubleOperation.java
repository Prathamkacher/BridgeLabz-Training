//Create a class DoubleOperation to perform double arithmetic operations.
import java.util.*;
public class DoubleOperation {
    public static void main(String[] args) {

        //Create variables to read a, b, and c and calculate operations
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Print statement for output
        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );
    }
}


