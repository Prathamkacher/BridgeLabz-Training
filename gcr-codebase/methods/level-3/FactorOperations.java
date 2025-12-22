//Create a class FactorOperations to perform various tasks using factors array.
import java.util.*;
public class FactorOperations {

    //Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {

        //loop to count number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        //loop to store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    //Method to find the greatest factor.
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int f : factors) {
            if (f > greatest) {
                greatest = f;
            }
        }
        return greatest;
    }

    //Method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    //Method to find product of factors.
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    //Method to find product of cubes of factors
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        //Find factors
        int[] factors = findFactors(number);

        //display factors
        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        //print operations
        System.out.println("Greatest factor = " + findGreatestFactor(factors));
        System.out.println("Sum of factors = " + findSumOfFactors(factors));
        System.out.println("Product of factors = " + findProductOfFactors(factors));
        System.out.println("Product of cube of factors = " + findProductOfCubes(factors));
    }
}