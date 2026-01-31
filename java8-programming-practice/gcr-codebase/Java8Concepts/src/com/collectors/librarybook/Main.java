package com.collectors.librarybook;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("The Silent Code", "Technology", 450),
                new Book("Future AI", "Technology", 380),
                new Book("Mystery of Shadows", "Fiction", 320),
                new Book("The Lost Empire", "Fiction", 500),
                new Book("World History", "History", 600),
                new Book("Ancient Civilizations", "History", 720)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        statsByGenre.forEach((genre, stats) ->
                System.out.printf(
                        "Genre: %-12s | Total Pages: %-4d | Avg Pages: %-6.2f | Max Pages: %-4d%n",
                        genre,
                        stats.getSum(),
                        stats.getAverage(),
                        stats.getMax()
                ));
    }
}
