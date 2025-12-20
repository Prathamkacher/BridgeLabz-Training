//Create a class TriangularPark to calculate number of rounds for a 5 km run.
import java.util.*;
public class TriangularPark {

    //Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take user input for sides of the triangular park
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Please enter positive values for all sides");
            return;
        }

        //Calculate number of rounds
        double rounds = calculateRounds(side1, side2, side3);

        //Display result
        System.out.println(
            "The athlete needs to complete " + rounds + " rounds to complete a 5 km run"
        );
    }
}
