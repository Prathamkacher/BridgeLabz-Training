//Create a class RocketLaunchFor to count down numbers using a for loop.
import java.util.*;
public class RocketLaunchFor {
    public static void main(String[] args) {

        //Create variable to read countdown starting value
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        //Countdown using for loop and print statement.
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}