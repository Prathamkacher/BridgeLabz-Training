//Create a class RandomNumber to generate random numbers and find average, min, and max.
public class RandomNumber {

    //Method to generate 4-digit random numbers
    public static int[] generateNum(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    //Method to find average, minimum, and maximum value
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;
		
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        //generate 5 random 4-digit numbers.
        int[] randomNumbers = generateNum(5);

        //Display generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        //Find average, min, and max
        double[] result = findAverageMinMax(randomNumbers);

        //Display results
        System.out.println("Average value = " + result[0]);
        System.out.println("Minimum value = " + (int) result[1]);
        System.out.println("Maximum value = " + (int) result[2]);
    }
}