package com.day9.homenest;

class Lock extends Device {
	public Lock(String deviceId) {
		super(deviceId);
	}
	
	@Override
	public void reset() {
		System.out.println(deviceId + " Lock reset: Security keys refreshed.");
	}
}