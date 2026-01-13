package com.day9.homenest;

class Thermostat extends Device {
	public Thermostat(String deviceId) {
		super(deviceId);
	}
	
	@Override
	public void reset() {
		System.out.println(deviceId + " Thermostat reset: Temperature set to 24°C.");
	}
}