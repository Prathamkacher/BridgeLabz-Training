package com.day6.parkease;

public class ParkEaseMain {

    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot("A1", "Car");
        Vehicle car = new Car("UP32AB1234");

        ParkingManager manager = new ParkingManager();

        manager.assignSlot(slot1, car);
        manager.releaseSlot(slot1, 4);
    }
}
