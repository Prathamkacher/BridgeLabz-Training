package com.day2.smarthomeautomationsystem;

class AC extends Appliance {

    AC(int power) {
        super("AC", power);
    }

    @Override
    public void turnOn() {
        System.out.println("AC cooling started ❄️");
    }
}
