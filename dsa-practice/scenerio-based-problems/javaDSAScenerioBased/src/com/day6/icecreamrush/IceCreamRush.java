package com.day6.icecreamrush;

public class IceCreamRush {

    public static void bubbleSort(Flavor[] flavors) {

        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                // Sort by popularity (descending)
                if (flavors[j].sales < flavors[j + 1].sales) {

                    // swap
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }
}
