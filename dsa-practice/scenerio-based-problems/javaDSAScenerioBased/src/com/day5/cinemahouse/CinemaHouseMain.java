/*
 * 7. CinemaHouse – Movie Time Sorting (Bubble Sort)
Story: A small local cinema lists daily movie shows. The screen manager updates showtimes
manually and prefers a simple sorting logic. Since the number of shows is small (~10), Bubble
Sort is used.
Key Concepts:
● Manual data entry, simple logic
● Small dataset
● Minimal code complexity
 */

package com.day5.cinemahouse;

public class CinemaHouseMain {

    public static void main(String[] args) {

        Show[] shows = {
            new Show("10:30"),
            new Show("18:00"),
            new Show("13:15"),
            new Show("09:45"),
            new Show("16:00")
        };

        System.out.println("Before Sorting:");
        for (Show s : shows)
            System.out.print(s + "  ");

        CinemaHouse.bubbleSort(shows);

        System.out.println("\n\nAfter Sorting (By Time):");
        for (Show s : shows)
            System.out.print(s + "  ");
    }
}
