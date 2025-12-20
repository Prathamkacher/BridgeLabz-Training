//Create a class WindCalculator to calculate wind chill temperature.
import java.util.*;
public class WindCalculator {

    //Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take user input for temperature and wind speed
        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        //Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        //Display result
        System.out.println(
            "The wind chill temperature is " + windChill + " for temperature " + temperature +
            " and wind speed " + windSpeed
        );
    }
}
