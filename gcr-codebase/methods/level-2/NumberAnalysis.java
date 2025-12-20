//Create a class NumberAnalysis to analyze numbers using methods.
import java.util.*;
public class NumberAnalysis {

    //Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    //Method to check whether a number is even or odd.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //array to store 5 numbers
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        //check each number and print output
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is a positive even number");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number");
                }
            } else {
                System.out.println(numbers[i] + " is a negative number");
            }
        }

        //Compare first and last elements and print output
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First element is greater than last element");
        } else if (result == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
