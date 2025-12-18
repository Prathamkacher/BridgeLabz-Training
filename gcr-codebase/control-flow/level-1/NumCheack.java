//Create a class NumCheack to check the number is positive, negative or zero.
import java.util.*;
public class NumCheack {
    public static void main(String[] args) {

        //Create variables to read input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Check if number is positive, negative or zero and print the output
        if (num > 0) {
            System.out.println("positive");
        }

        else if (num < 0) {
            System.out.println("negative");
        } 
        else {
            System.out.println("zero");
        }
    }
}