package com.inheritance.singleinheritance.smarthome;

public class DeviceMain {
    public static void main(String[] args) {

        Device device = new Thermostat("TH-101", "ON", 24);
        device.displayStatus();
    }
}
