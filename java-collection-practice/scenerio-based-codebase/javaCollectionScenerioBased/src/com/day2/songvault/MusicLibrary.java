package com.day_2.songvault;

import java.util.*;
import java.util.stream.*;

public class MusicLibrary {

    public static Map<String, List<Song>> groupByGenre(List<Song> songs) {
        return songs.stream().collect(Collectors.groupingBy(s -> s.genre));
    }

    public static Set<String> uniqueArtists(List<Song> songs) {
        return songs.stream().map(s -> s.artist).collect(Collectors.toSet());
    }

    public static List<Song> filterByArtist(List<Song> songs, String artist) {
        return songs.stream()
                .filter(s -> s.artist.equalsIgnoreCase(artist))
                .collect(Collectors.toList());
    }

    public static List<Song> sortByTitle(List<Song> songs) {
        return songs.stream()
                .sorted(Comparator.comparing(s -> s.title))
                .collect(Collectors.toList());
    }
}
