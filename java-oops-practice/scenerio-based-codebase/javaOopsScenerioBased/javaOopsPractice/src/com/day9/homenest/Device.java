package com.day9.homenest;

abstract class Device implements IControllable {
	protected String deviceId;
    private boolean status;          // cannot be modified externally
    protected double energyUsage;

    protected String firmwareLogs = "Secure logs"; // protected access

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;   // default OFF
        this.energyUsage = 0;
    }

    public boolean getStatus() {
        return status;
    }

    @Override
    public void turnOn() {
        status = true;
        energyUsage += 10;   // operator used
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println(deviceId + " turned OFF");
    }

    public double getEnergyUsage() {
        return energyUsage;
    }
}