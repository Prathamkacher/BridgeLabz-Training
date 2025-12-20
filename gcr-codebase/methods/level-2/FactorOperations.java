//Create a class FactorOperations to find factors, their sum, sum of squares, and product.
import java.util.*;
public class FactorOperations {

    //Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        //Create array
        int[] factors = new int[count];

        //store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    //Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    //Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    //Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input number.
        int number = input.nextInt();

        //validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        //Find factors.
        int[] factors = findFactors(number);

        //Display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        //Calculate results
        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        //Display results
        System.out.println("Sum of factors is " + sum);
        System.out.println("Product of factors is " + product);
        System.out.println("Sum of squares of factors is " + sumOfSquares);
    }
}