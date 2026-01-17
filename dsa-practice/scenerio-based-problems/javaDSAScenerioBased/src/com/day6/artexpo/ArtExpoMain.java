/*
 * 9. ArtExpo – Sort Artists by Registration Time (Insertion Sort)
Story: At an art exhibition, artists register throughout the day. The system continuously adds
each entry and maintains a sorted list by registration time for booth assignment. Insertion Sort
fits well due to the incremental nature.
Key Concepts:
● Real-time insertion
● Nearly sorted data
● Time-based ordering
 */

package com.day6.artexpo;

public class ArtExpoMain {

    public static void main(String[] args) {

        ArtExpo expo = new ArtExpo();

        expo.registerArtist("Aarti", "09:10");
        expo.registerArtist("Rohan", "09:25");
        expo.registerArtist("Meena", "10:05");

        // Late entry but earlier time
        expo.registerArtist("Kunal", "09:40");

        expo.displayArtists();
    }
}
