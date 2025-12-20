//create a class Trigonometry to calculate trigonometric functions using Math class.
import java.util.*;
public class Trigonometry {

    //Method to calculate sine, cosine, and tangent
    public static double[] trigonometricFunctions(double angle) {

        //convert angle from degrees to radians.
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        //Return results as an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input angle in degrees
        double angle = input.nextDouble();

        //Call method
        double[] result = trigonometricFunctions(angle);

        //Display result
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine = " + result[0]);
        System.out.println("Cosine = " + result[1]);
        System.out.println("Tangent = " + result[2]);
    }
}
