//create a class MeanHeight to find the mean height of football players.
import java.util.*;
public class MeanHeight {
    public static void main(String[] args) {

        //Create a double array to store heights of 11 players
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];

        //Read heights from user
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        //calculate sum of heights.
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        //Calculate mean height
        double mean = sum / heights.length;

        //Print the mean height
        System.out.println("The mean height of the football team is " + mean);
    }
}
