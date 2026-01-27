package com.day_1.travellog;

import java.util.*;
import java.util.regex.*;

public class TravelAnalyzer {

    // Find cities using regex in notes
    public static Set<String> findCitiesInNotes(List<Trip> trips, String regex) {
        Set<String> cities = new HashSet<>();
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        for (Trip t : trips) {
            Matcher m = p.matcher(t.notes);
            if (m.find()) {
                cities.add(t.city);
            }
        }
        return cities;
    }

    // Trips longer than 5 days
    public static List<Trip> longTrips(List<Trip> trips) {
        List<Trip> result = new ArrayList<>();
        for (Trip t : trips) {
            if (t.durationDays > 5) {
                result.add(t);
            }
        }
        return result;
    }

    // Unique countries
    public static Set<String> uniqueCountries(List<Trip> trips) {
        Set<String> countries = new HashSet<>();
        for (Trip t : trips) {
            countries.add(t.country);
        }
        return countries;
    }

    // Top 3 most visited cities
    public static List<Map.Entry<String, Integer>> topCities(List<Trip> trips) {
        Map<String, Integer> map = new HashMap<>();

        for (Trip t : trips) {
            map.put(t.city, map.getOrDefault(t.city, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        return list.subList(0, Math.min(3, list.size()));
    }
}
