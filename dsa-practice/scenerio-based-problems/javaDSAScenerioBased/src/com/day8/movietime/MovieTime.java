package com.day8.movietime;

import java.util.*;

public class MovieTime {
	
	private ArrayList<Show> shows = new ArrayList<>();

    // Add show and keep sorted
    public void addShow(String movie, String time) {

        Show newShow = new Show(movie, time);
        shows.add(newShow);
        
        int i = shows.size() - 1;
        
        while(i>0 && shows.get(i-1).minute > shows.get(i).minute) {
        	Show temp = shows.get(i);
        	shows.set(i, shows.get(i-1));
        	shows.set(i-1, temp);
        	
        	i--;
        }
        System.out.println("Show added: " + movie + " at " + time);
	}
    
    public void displayShows() {
    	System.out.println("\nUpcoming Shows:");
        for (Show s : shows) {
            System.out.println(s);
        }
    }
}
