package com.day2.smarthomeautomationsystem;

class Light extends Appliance {

    Light(int power) {
        super("Light", power);
    }

    @Override
    public void turnOn() {
        System.out.println("Light glows softly 💡");
    }
}
