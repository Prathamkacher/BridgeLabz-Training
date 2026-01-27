package com.day_1.travellog;

import java.util.*;

public class TravelLogApp {

    public static void main(String[] args) {
        try {
            List<Trip> trips = new ArrayList<>();

            trips.add(new Trip("Paris", "France", 7, "Visited Eiffel Tower and cafes"));
            trips.add(new Trip("Tokyo", "Japan", 4, "Sushi, temples, and neon streets"));
            trips.add(new Trip("Paris", "France", 6, "Louvre Museum and art walk"));
            trips.add(new Trip("Delhi", "India", 3, "Street food adventure"));
            trips.add(new Trip("Tokyo", "Japan", 8, "Anime district exploration"));

            // Save trips
            TripStorage.saveTrips(trips, "trips.dat");

            // Load trips
            List<Trip> loadedTrips = TripStorage.loadTrips("trips.dat");

            System.out.println("Cities mentioned in notes (regex: 'tower|temple|museum'):");
            System.out.println(TravelAnalyzer.findCitiesInNotes(loadedTrips, "tower|temple|museum"));

            System.out.println("\nTrips longer than 5 days:");
            System.out.println(TravelAnalyzer.longTrips(loadedTrips));

            System.out.println("\nUnique countries visited:");
            System.out.println(TravelAnalyzer.uniqueCountries(loadedTrips));

            System.out.println("\nTop 3 most visited cities:");
            System.out.println(TravelAnalyzer.topCities(loadedTrips));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
