//Create a class DivisibleByFive to check if a number is divisible by 5.
import java.util.*;
public class DivisibleByFive {
    public static void main(String[] args) {

        //Create variable to read number and check divisibility
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isDivisible = (number % 5 == 0);

        // Print statement for output
        System.out.println(
            "Is the number " + number + " divisible by 5? " + isDivisible
        );
    }
}
