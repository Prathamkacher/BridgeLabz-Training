//Create a class FootballTeamHeight to find shortest, tallest and mean height
public class FootballTeamHeight {

    //method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    //method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    //Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    //method to find shortest height.
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    //method to find tallest height.
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        //create array for 11 players.
        int[] heights = generateHeights(11);

        //Display heights
        System.out.println("Heights of football players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        //Calculate values
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        //Display results
        System.out.println("Shortest height = " + shortest + " cm");
        System.out.println("Tallest height = " + tallest + " cm");
        System.out.println("Mean height = " + mean + " cm");
    }
}
