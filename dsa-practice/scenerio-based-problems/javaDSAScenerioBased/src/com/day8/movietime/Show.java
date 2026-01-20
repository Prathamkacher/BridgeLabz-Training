package com.day8.movietime;

public class Show {
	String movie;
	String time;
	int minute;
	
	public Show(String movie, String time) {
		this.movie = movie;
		this.time = time;
		this.minute = convertToMinutes(time);
	}
	
	private int convertToMinutes(String time) {
		String[] parts = time.split(":");
		int hour = Integer.parseInt(parts[0]);
		int minute = Integer.parseInt(parts[1]);
		
		return hour * 60 + minute;
	}
	
	@Override
	public String toString() {
		return time + " - " + movie;
	}
}
