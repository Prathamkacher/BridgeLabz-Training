package com.day2.smarthomeautomationsystem;

class UserController {

    public void operateDevice(Controllable device) {
        device.turnOn();
        device.turnOff();
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage())
            System.out.println(a1.name + " consumes more power");
        else if (a1.getPowerUsage() < a2.getPowerUsage())
            System.out.println(a2.name + " consumes more power");
        else
            System.out.println("Both consume equal power");
    }
}
