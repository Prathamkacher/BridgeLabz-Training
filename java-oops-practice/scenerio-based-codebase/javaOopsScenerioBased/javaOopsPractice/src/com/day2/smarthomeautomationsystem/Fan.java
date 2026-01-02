package com.day2.smarthomeautomationsystem;

class Fan extends Appliance {

    Fan(int power) {
        super("Fan", power);
    }

    @Override
    public void turnOn() {
        System.out.println("Fan starts rotating 🌀");
    }
}
