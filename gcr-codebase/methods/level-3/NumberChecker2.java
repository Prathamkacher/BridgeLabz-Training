//Create a class NumberChecker2 with static methods.
import java.util.*;
public class NumberChecker2 {

    //Method to find count of digits
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

    //Method to store digits of number in an array
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

    //Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    //Method to find sum of squares of digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    //Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;
        return number % sum == 0;
    }

    //Method to find frequency of each digit using 2D array.
    public static int[][] digitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        //Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        //Count frequency
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    //Main method.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Count digits
        int count = countDigits(number);
        System.out.println("Count of digits = " + count);

        //Digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        //Sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits = " + sumDigits);

        //Sum of squares of digits
        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits = " + sumSquares);

        //Harshad number check
        System.out.println("Is Harshad Number? " + isHarshadNumber(number, digits));

        //Digit frequency
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] +
                                   " occurs " + frequency[i][1] + " time(s)");
            }
        }
    }
}
