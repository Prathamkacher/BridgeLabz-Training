package com.day5.cropmonitor;

public class SensorData {
    String time;
    int temperature;
    int minutes;   // for comparison

    public SensorData(String time, int temperature) {
        this.time = time;
        this.temperature = temperature;
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
        return time + " → " + temperature + "°C";
    }
}