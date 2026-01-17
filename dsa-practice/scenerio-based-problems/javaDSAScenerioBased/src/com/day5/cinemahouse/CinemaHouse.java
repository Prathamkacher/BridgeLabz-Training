package com.day5.cinemahouse;

public class CinemaHouse {

    public static void bubbleSort(Show[] shows) {

        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (shows[j].minutes > shows[j + 1].minutes) {

                    // swap
                    Show temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }
}
