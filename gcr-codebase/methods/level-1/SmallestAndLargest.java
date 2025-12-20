//Create a class SmallestAndLargest to find the smallest and largest of three numbers.
import java.util.*;
public class SmallestAndLargest {

    //Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        //Compare with second number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        //Compare with third number
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        //Return result as array
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take user input for three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        //Call the method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        //Display result
        System.out.println("The smallest number is " + result[0]);
        System.out.println("The largest number is " + result[1]);
    }
}
