package com.day5.cinemahouse;

public class Show {
    String time;   // example "10:30"
    int minutes;   // total minutes for comparison

    public Show(String time) {
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
        return time;
    }
}