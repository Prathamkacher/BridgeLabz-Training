//Create a class SumOfNaturalNumbers to find the sum of n natural numbers using a loop.
import java.util.*;
public class SumOfNaturalNumbers {

    //Method to calculate sum of n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;

        //Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //Check for natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number");
            return;
        }

        //Call method
        int result = calculateSum(n);

        //Display result
        System.out.println(
            "The sum of first " + n + " natural numbers is " + result
        );
    }
}
