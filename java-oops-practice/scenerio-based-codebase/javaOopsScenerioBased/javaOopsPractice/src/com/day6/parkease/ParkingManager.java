package com.day6.parkease;

import java.util.*;

class ParkingManager {

    private Map<ParkingSlot, Vehicle> activeBookings = new HashMap<>();

    public void assignSlot(ParkingSlot slot, Vehicle vehicle) {
        if (slot.isAvailable()) {
            slot.occupySlot();
            activeBookings.put(slot, vehicle);
            log("Slot " + slot.getSlotId() + " assigned to " + vehicle.getVehicleNumber());
        } else {
            log("Slot " + slot.getSlotId() + " is already occupied");
        }
    }

    public void releaseSlot(ParkingSlot slot, int hours) {
        Vehicle vehicle = activeBookings.get(slot);
        if (vehicle != null) {
            double charges = vehicle.calculateCharges(hours);
            slot.freeSlot();
            activeBookings.remove(slot);
            log("Slot " + slot.getSlotId() + " released. Charges: ₹" + charges);
        }
    }

    // Logs exposed, data hidden
    private void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
