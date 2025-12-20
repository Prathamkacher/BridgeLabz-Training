//Create a class YoungestAndTallestArrays to find youngest and tallest friends.
import java.util.*;
public class YoungestAndTallestArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //arrays to store ages, heights and names of 3 friend.
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        //Take user input for ages
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        //Take user input for heights
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        //find youngest friend.
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        //Find tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        //print results
        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);
    }
}

