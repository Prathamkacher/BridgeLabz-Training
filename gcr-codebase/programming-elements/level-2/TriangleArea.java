
import java.util.*;
public class TriangleArea {
    public static void main(String[] args) {
		
		//create variable for input.
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        //create variable to calculate area in cm and inch.
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516;

        // Print statement for output
        System.out.println("The area of the triangle in square inches is " + areaInSqInches + " while in centimeters is " + areaInSqCm);
    }
}
