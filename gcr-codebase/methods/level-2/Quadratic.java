//create a class Quadratic to find the roots of a quadratic equation.
import java.util.*;
public class Quadratic {

    //Method to find roots.
    public static double[] findRoots(double a, double b, double c) {

        //Calculate delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
		//return empty array
        else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take input values a, b, and c
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //find roots
        double[] roots = findRoots(a, b, c);

        //Display result
        if (roots.length == 2) {
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("Only one root = " + roots[0]);
        } else {
            System.out.println("No real roots exist");
        }
    }
}
