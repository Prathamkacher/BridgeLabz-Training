//Create a class NumberAnalysis to analyze numbers and compare first and last elements.
import java.util.*;
public class NumberAnalysis {
    public static void main(String[] args) {

        //Define an integer array of 5 elements
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        //Take user input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        //Analyze each number and print output
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number");
                } else {
                    System.out.println(numbers[i] + " is a positive odd number");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number");
            } else {
                System.out.println(numbers[i] + " is zero");
            }
        }

        //Compare first and last elements and print output
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
