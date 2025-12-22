//Create a class NumberChecker3 with static methods.
import java.util.*;
public class NumberChecker3 {

    //method to find count of digits
    public static int countDigits(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;

        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    //Method to store digits of the number in an array
    public static int[] getDigitsArray(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];

        if (number == 0) {
            digits[0] = 0;
            return digits;
        }

        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        return digits;
    }

    //method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    //method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //method to check if number is a palindrome.
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    //Method to check if number is a Duck number
    //Duck number: contains at least one non-zero digit
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    //Main method.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //method to count digits
        System.out.println("Count of digits = " + countDigits(number));

        //method to get digits array.
        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        //Reverse digits array
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed digits array: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        //Compare arrays
        System.out.println("Digits and reversed arrays equal? " +
                           compareArrays(digits, reversed));

        //Palindrome check
        System.out.println("Is Palindrome Number? " + isPalindrome(digits));

        //Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}
