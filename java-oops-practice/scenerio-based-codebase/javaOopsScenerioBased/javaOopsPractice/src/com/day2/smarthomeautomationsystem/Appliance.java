package com.day2.smarthomeautomationsystem;

class Appliance implements Controllable {
    protected String name;
    private boolean isOn;
    private int powerUsage;

    Appliance(String name, int powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " turned OFF");
    }
}
