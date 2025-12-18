//Create a class DistanceInYard to find the distance in yards and miles.
import java.util.*;
public class DistanceInYard {
    public static void main(String[] args) {

        //Create variable to read perimeter and calculate side of square
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextDouble();

        //Convert feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        //Convert yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Print statement for output
        System.out.println(
            "The distance in yards is " + distanceInYards +
            " and the distance in miles is " + distanceInMiles
        );
    }
}
