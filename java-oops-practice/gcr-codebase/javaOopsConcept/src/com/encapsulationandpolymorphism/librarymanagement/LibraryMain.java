package com.encapsulationandpolymorphism.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        LibraryItem item1 = new Book(1, "Clean Code", "Robert C. Martin");
        LibraryItem item2 = new Magazine(2, "Time", "Time Editors");
        LibraryItem item3 = new DVD(3, "Inception", "Christopher Nolan");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        for (LibraryItem item : items) {
            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Aryaman");
            }

            System.out.println("---------------------------");
        }
    }
}
