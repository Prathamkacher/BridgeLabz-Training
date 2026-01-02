package com.day2.smarthomeautomationsystem;

public class Main {
    public static void main(String[] args) {

        Appliance light = new Light(40);
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        UserController user = new UserController();

        user.operateDevice(light);
        user.operateDevice(ac);

        user.compareEnergy(fan, ac);
    }
}
