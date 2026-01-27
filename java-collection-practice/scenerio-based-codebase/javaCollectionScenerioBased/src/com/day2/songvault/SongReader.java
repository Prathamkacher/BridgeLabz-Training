package com.day_2.songvault;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class SongReader {

    private static final Pattern TITLE = Pattern.compile("Title: (.*)");
    private static final Pattern ARTIST = Pattern.compile("Artist: (.*)");
    private static final Pattern DURATION = Pattern.compile("Duration: (.*)");
    private static final Pattern GENRE = Pattern.compile("Genre: (.*)");

    public static List<Song> readSongs(String folderPath) {
        List<Song> songs = new ArrayList<>();
        File folder = new File(folderPath);

        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".txt")) {
                try {
                    List<String> lines = Files.readAllLines(file.toPath());

                    String title = "", artist = "", duration = "", genre = "";

                    for (String line : lines) {
                        if (TITLE.matcher(line).find()) title = line.split(": ")[1];
                        if (ARTIST.matcher(line).find()) artist = line.split(": ")[1];
                        if (DURATION.matcher(line).find()) duration = line.split(": ")[1];
                        if (GENRE.matcher(line).find()) genre = line.split(": ")[1];
                    }

                    songs.add(new Song(title, artist, duration, genre));

                } catch (Exception e) {
                    System.out.println("Error reading " + file.getName());
                }
            }
        }
        return songs;
    }
}
