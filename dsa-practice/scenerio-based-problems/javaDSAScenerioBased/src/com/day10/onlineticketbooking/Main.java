package com.day10.onlineticketbooking;

public class Main {
    public static void main(String[] args) {

        EventAVL events = new EventAVL();

        events.insert(1, "Concert", 1800);
        events.insert(2, "Movie", 1500);
        events.insert(3, "Standup Show", 2000);
        events.insert(4, "Tech Talk", 1400);

        events.displayEvents();

        events.delete(1500); // Movie cancelled

        events.displayEvents();
    }
}
