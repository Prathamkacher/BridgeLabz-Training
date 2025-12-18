//Create a class RocketLaunch to count down numbers using a while loop.
import java.util.*;
public class RocketLaunch {
    public static void main(String[] args) {

        //Create variable to read countdown starting value
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        //Countdown using while loop and print statement
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
