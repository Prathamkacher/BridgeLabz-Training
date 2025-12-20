//Create a class YoungestAndTallestFriend to find youngest and tallest among friends.
import java.util.*;
public class YoungestAndTallestFriend {

    //method to the youngest
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //Method to find the tallest
    public static int findTallest(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        //array to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        //user input
        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        //method to find youngest and tallest
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        //print results
        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);
    }
}
