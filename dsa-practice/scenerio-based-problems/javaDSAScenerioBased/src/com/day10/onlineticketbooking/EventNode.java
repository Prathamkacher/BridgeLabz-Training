package com.day10.onlineticketbooking;

public class EventNode {
    int eventId;
    String eventName;
    int startTime; // using integer for simplicity (e.g., 1400 = 2PM)
    int height;

    EventNode left, right;

    EventNode(int eventId, String eventName, int startTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.startTime = startTime;
        this.height = 1;
    }
}
