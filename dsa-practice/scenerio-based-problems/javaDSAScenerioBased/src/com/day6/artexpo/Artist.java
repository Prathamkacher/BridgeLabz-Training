package com.day6.artexpo;

public class Artist {
    String name;
    String time;
    int minutes;

    public Artist(String name, String time) {
        this.name = name;
        this.time = time;
        this.minutes = convertToMinutes(time);
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        return hour * 60 + minute;
    }

    @Override
    public String toString() {
        return time + " → " + name;
    }
}
