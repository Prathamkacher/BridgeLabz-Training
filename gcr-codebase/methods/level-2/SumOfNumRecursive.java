//create a class SumOfNumRecursive to compare recursive and formula results.
import java.util.*;
public class SumOfNumRecursive {

    //method to find sum using recursion.
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    //Method to find sum using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //Check for natural number
        if (n <= 0) {
            System.out.println("Please enter a natural number");
            return;
        }

        //Calculate sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        //Calculate sum using formula
        int formulaSum = sumUsingFormula(n);

        //print results
        System.out.println("Sum using recursion is " + recursiveSum);
        System.out.println("Sum using formula is " + formulaSum);

        //compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are equal. Computation is correct.");
        } else {
            System.out.println("Results are not equal. Computation is incorrect.");
        }
    }
}
