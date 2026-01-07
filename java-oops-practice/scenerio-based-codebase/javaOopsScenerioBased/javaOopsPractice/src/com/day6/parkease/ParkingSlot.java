package com.day6.parkease;

class ParkingSlot {

	private String slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;

	public ParkingSlot(String slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
	}

	public boolean isAvailable() {
		return !isOccupied;
	}

	public String getVehicleTypeAllowed() {
		return vehicleTypeAllowed;
	}

	// Internal control only
	protected void occupySlot() {
		isOccupied = true;
	}

	protected void freeSlot() {
		isOccupied = false;
	}

	public String getSlotId() {
		return slotId;
	}
}
