package com.stackandqueues.circulartour;

public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {

        int surplus = 0;
        int deficit = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {

            surplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset start
            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        // Check if total petrol is sufficient
        if (surplus + deficit >= 0) {
            return start;
        }

        return -1;
    }
}
