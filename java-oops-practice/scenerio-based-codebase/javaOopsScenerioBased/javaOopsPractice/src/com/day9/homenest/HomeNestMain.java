package com.day9.homenest;

class HomeNestMain {

    public static void main(String[] args) {

        Device light = new Light("L1");
        Device camera = new Camera("C1");
        Device thermostat = new Thermostat("T1");
        Device lock = new Lock("K1");

        // Turn ON devices
        light.turnOn();
        camera.turnOn();

        // Polymorphism in action
        light.reset();
        camera.reset();
        thermostat.reset();
        lock.reset();

        // Energy usage check
        System.out.println("\nEnergy Usage:");
        System.out.println("Light: " + light.getEnergyUsage());
        System.out.println("Camera: " + camera.getEnergyUsage());
    }
}
