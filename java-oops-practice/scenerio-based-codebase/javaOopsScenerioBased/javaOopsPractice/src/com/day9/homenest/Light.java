package com.day9.homenest;

class Light extends Device {
	public Light(String deviceId) {
		super(deviceId);
	}
	
	@Override
	public void reset() {
		System.out.println(deviceId + " Light reset: Brightness set to default.");
	}
}