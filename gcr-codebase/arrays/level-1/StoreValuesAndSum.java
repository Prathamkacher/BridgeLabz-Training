//Create a class StoreValuesAndSum to store values in an array and find their sum.
import java.util.*;
public class StoreValuesAndSum {
    public static void main(String[] args) {

        //Create array, total, and index variables
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        //while loop to take user input
        while (true) {
            if (index == 10) {
                break;
            }
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            //Store value in array and increase index.
            numbers[index] = value;
            index++;
        }

        //for loop to calculate total sum.
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        //print total sum.
        System.out.println("The total sum is " + total);
    }
}
