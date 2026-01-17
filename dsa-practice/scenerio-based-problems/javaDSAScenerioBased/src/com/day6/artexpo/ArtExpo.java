package com.day6.artexpo;

import java.util.*;


public class ArtExpo {

    private ArrayList<Artist> artists = new ArrayList<>();

    // Add artist and keep list sorted by time
    public void registerArtist(String name, String time) {

        Artist newArtist = new Artist(name, time);
        artists.add(newArtist);

        int i = artists.size() - 1;

        // Insertion sort (shift until correct position)
        while (i > 0 && artists.get(i - 1).minutes > artists.get(i).minutes) {

            // swap
            Artist temp = artists.get(i);
            artists.set(i, artists.get(i - 1));
            artists.set(i - 1, temp);

            i--;
        }

        System.out.println(name + " registered at " + time);
    }

    public void displayArtists() {
        System.out.println("\nBooth Assignment Order:");
        for (Artist a : artists) {
            System.out.println(a);
        }
    }
}
