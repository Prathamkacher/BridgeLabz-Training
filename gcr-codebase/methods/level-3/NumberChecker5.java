//Create a utility class NumberChecker5 with static methods.
import java.util.*;
public class NumberChecker5 {

    //Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int number) {
        if (number <= 1) return 0;

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //Method to check if number is Perfect.
    public static boolean isPerfect(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) == number;
    }

    //Method to check if number is Abundant
    public static boolean isAbundant(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) > number;
    }

    //method to check if number is Deficient
    public static boolean isDeficient(int number) {
        if (number <= 0) return false;
        return sumOfProperDivisors(number) < number;
    }

    //method to find factorial of a digit.
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    //method to check if number is Strong number: sum of factorial of digits == number
    public static boolean isStrong(int number) {
        int temp = Math.abs(number);
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == Math.abs(number);
    }

    //Main method.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Is Perfect Number? " + isPerfect(number));
        System.out.println("Is Abundant Number? " + isAbundant(number));
        System.out.println("Is Deficient Number? " + isDeficient(number));
        System.out.println("Is Strong Number? " + isStrong(number));
    }
}
