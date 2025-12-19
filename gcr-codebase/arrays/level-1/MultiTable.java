//Create a class MultiTable to print multiplication table from 6 to 9 using an array.
import java.util.*;
public class MultiTable {
    public static void main(String args[]) {

        //create variable to read input number
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //Define an integer array to store multiplication result
        int[] result = new int[4];

        //Store multiplication results for 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            result[index] = number * i;
            index++;
        }

        //print the multiplication table.
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(
                number + " * " + i + " = " + result[index]
            );
            index++;
        }
    }
}
