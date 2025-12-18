//Create a class SquareSide to find the side of a square using its perimeter.
import java.util.*;
public class SquareSide {
    public static void main(String[] args) {

        //Create variable to read perimeter and calculate side of square
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();

        //Calculate side of the square
        double side = perimeter / 4;

        // Print statement for output
        System.out.println(
            "The length of the side is " + side + " whose perimeter is " + perimeter
        );
    }
}
