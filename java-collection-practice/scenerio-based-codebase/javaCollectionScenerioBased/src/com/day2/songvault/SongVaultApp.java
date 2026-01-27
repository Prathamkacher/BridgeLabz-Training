package com.day_2.songvault;

import java.util.*;

public class SongVaultApp {

    public static void main(String[] args) {

        List<Song> songs = SongReader.readSongs("songs");

        Map<String, List<Song>> byGenre = MusicLibrary.groupByGenre(songs);
        Set<String> artists = MusicLibrary.uniqueArtists(songs);

        System.out.println("Songs Grouped by Genre");
        byGenre.forEach((g, list) -> System.out.println(g + " -> " + list));

        System.out.println("\nUnique Artists:");
        System.out.println(artists);

        System.out.println("\nSongs by Queen:");
        System.out.println(MusicLibrary.filterByArtist(songs, "Queen"));

        System.out.println("\nSongs Sorted by Title:");
        System.out.println(MusicLibrary.sortByTitle(songs));
    }
}
