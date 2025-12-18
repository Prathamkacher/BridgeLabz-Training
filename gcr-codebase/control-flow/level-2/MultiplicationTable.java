//Create a class MultiplicationTable to print table from 6 to 9 for a given number.
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {

        //Create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Print multiplication table from 6 to 9 and print the output.
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}