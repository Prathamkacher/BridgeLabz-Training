//Create a class MultiplicationTable to print multiplication table using an array.
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //create an integer array to store result from 1 to 10
        int[] table = new int[10];

        //Store multiplication results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        //print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                number + " * " + i + " = " + table[i - 1]
            );
        }
    }
}
