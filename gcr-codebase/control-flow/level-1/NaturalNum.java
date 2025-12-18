//Create a class NaturalNum to check the number is Natural or not and to calculate sum.
import java.util.*;
public class NaturalNum {
    public static void main(String[] args) {

        //Create variables to read input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //Check if num is natural and if it is then calculating sum and then print the output.
		int sum = (num * (num + 1)) / 2;

        if (num >= 0) {
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}