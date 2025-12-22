//Create a class NumberChecker with static methods.
import java.util.*;
public class NumberChecker {

    //Method to find count of digits in a number
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

    //Method to check if number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    //Method to check if number is an Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == Math.abs(number);
    }

    //Method to find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    //Method to find smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    //Main method.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //method to Count digits
        int count = countDigits(number);
        System.out.println("Count of digits = " + count);

        //method to get digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        //Check Duck number
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        //Check Armstrong number
        System.out.println("Is Armstrong Number? " + isArmstrong(number, digits));

        //Largest and second largest
        int[] large = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit = " + large[0]);
        System.out.println("Second largest digit = " + large[1]);

        //Smallest and second smallest
        int[] small = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit = " + small[0]);
        System.out.println("Second smallest digit = " + small[1]);
    }
}