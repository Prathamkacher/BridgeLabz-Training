/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.*;
public class TemperatureLogger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] temperatures = new double[7];
        double totalTemp = 0.0;

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        WEEKLY TEMPERATURE LOG        ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        // Input temperatures
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print(" Enter temperature for Day " + (i + 1) + " : ");
            temperatures[i] = input.nextDouble();
            totalTemp += temperatures[i];
        }

        // Calculate average
        double averageTemp = totalTemp / temperatures.length;

        // Find maximum temperature
        double maxTemp = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
            }
        }

        // Output summary
        System.out.println("\n════════════  TEMPERATURE SUMMARY  ═════════");
        System.out.printf(" Average Temperature : %.2f °C%n", averageTemp);
        System.out.printf(" Maximum Temperature : %.2f °C%n", maxTemp);
        System.out.println("══════════════════════════════════════════════");

        System.out.println("\n Data logged successfully. Stay weather-aware!");
    }
}		