package com.day9.homenest;

class Camera extends Device {
	public Camera(String deviceId) {
		super(deviceId);
	}
	
	@Override
	public void reset() {
		System.out.println(deviceId + " Camera reset: Rebooting camera system.");
	}
}