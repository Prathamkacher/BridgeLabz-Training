//Create a utility class NumberChecker4 with static methods.
import java.util.*;
public class NumberChecker {

    //Method to check if number is Prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Method to check if number is Neon number: sum of digits of square == number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    //Method to check if number is Spy number: sum of digits == product of digits
    public static boolean isSpy(int number) {
        number = Math.abs(number);
        int sum = 0;
        int product = 1;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    //method to check if number is Automorphic: square ends with the number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    //Method to check if number is Buzz
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    //Main method.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Is Prime Number? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeon(number));
        System.out.println("Is Spy Number? " + isSpy(number));
        System.out.println("Is Automorphic Number? " + isAutomorphic(number));
        System.out.println("Is Buzz Number? " + isBuzz(number));
    }
}
