package com.stream.iotsensorreading;

public class SensorReading {

    private String sensorId;
    private double temperature;
    private String location;

    public SensorReading(String sensorId, double temperature, String location) {
        this.sensorId = sensorId;
        this.temperature = temperature;
        this.location = location;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getLocation() {
        return location;
    }
}
