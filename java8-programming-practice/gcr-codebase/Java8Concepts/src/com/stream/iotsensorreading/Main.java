package com.stream.iotsensorreading;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        double threshold = 75.0;

        List<SensorReading> readings = Arrays.asList(
                new SensorReading("S-101", 72.5, "Server Room"),
                new SensorReading("S-102", 80.2, "Factory Floor"),
                new SensorReading("S-103", 69.8, "Warehouse"),
                new SensorReading("S-104", 90.1, "Boiler Unit"),
                new SensorReading("S-105", 76.3, "Data Center")
        );

        readings.stream()
                .filter(r -> r.getTemperature() > threshold)
                .forEach(r ->
                        System.out.println("ALERT Sensor: " + r.getSensorId()
                                + " | Location: " + r.getLocation()
                                + " | Temperature: " + r.getTemperature() + "°C")
                );
    }
}
