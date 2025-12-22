//Create a class EuclideanDistance to find Euclidean distance between two points as well as the equation of the line.
import java.util.*;

public class EuclideanDistance {

    //Method to find Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    //Method to find slope and y-intercept.
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //input for two points
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Find Euclidean distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        //Find equation of line
        double[] line = findLineEquation(x1, y1, x2, y2);

        
        System.out.println("Slope (m) = " + line[0]);
        System.out.println("Y-intercept (b) = " + line[1]);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);     
    }
}
