package com.day5.cropmonitor;

public class CropMonitorMain {

    public static void main(String[] args) {

        SensorData[] data = {
            new SensorData("10:15", 32),
            new SensorData("09:05", 28),
            new SensorData("11:30", 35),
            new SensorData("08:50", 26),
            new SensorData("10:45", 33)
        };

        System.out.println("Before Sorting:");
        for (SensorData s : data)
            System.out.println(s);

        CropMonitor.quickSort(data, 0, data.length - 1);

        System.out.println("\nAfter Sorting (by Time):");
        for (SensorData s : data)
            System.out.println(s);
    }
}
