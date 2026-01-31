package com.stream.trendingmovies;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TrendingMovies {

    public static void main(String[] args) {

    	List<Movie> movies = List.of(
    	        new Movie("Oppenheimer", 8.6, 2023),
    	        new Movie("Dune: Part Two", 8.8, 2024),
    	        new Movie("Everything Everywhere All at Once", 8.9, 2022),
    	        new Movie("Joker", 8.4, 2019),
    	        new Movie("Avengers: Endgame", 8.4, 2019),
    	        new Movie("The Batman", 7.8, 2022),
    	        new Movie("Top Gun: Maverick", 8.3, 2022),
    	        new Movie("Spider-Man: No Way Home", 8.2, 2021)
    	);

        System.out.println("Top 5 Trending Movies");

        List<Movie> top5TrendingMovies = movies.stream()
                .filter(movie -> movie.getRating() >= 8)
                .sorted(Comparator
                        .comparing(Movie::getRating).reversed()
                        .thenComparing(Movie::getReleaseYear, Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-35s %-10s %-5s%n", "MOVIE NAME", "RATING", "YEAR");
        System.out.println("------------------------------------------------------------");

        for (Movie movie : top5TrendingMovies) {
            System.out.printf("%-35s %-10.1f %-5d%n",
                    movie.getName(),
                    movie.getRating(),
                    movie.getReleaseYear());
        }

        System.out.println("------------------------------------------------------------");

    }
}