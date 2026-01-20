package com.day8.movietime;

public class MovieTimeMain {

    public static void main(String[] args) {

        MovieTime theater = new MovieTime();

        theater.addShow("Avengers Doomsday", "09:30");
        theater.addShow("Dhurander", "11:00");
        theater.addShow("Franklestien", "13:15");
        theater.addShow("KGF", "16:00");

        // Inserted between times
        theater.addShow("Interstellar", "10:15");

        theater.displayShows();
    }
}
