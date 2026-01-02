package com.encapsulationandpolymorphism.librarymanagement;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
