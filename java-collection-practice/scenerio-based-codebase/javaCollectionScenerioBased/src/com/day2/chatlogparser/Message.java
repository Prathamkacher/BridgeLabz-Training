package com.day_2.chatlogparser;

public class Message {
    String time;
    String user;
    String text;

    public Message(String time, String user, String text) {
        this.time = time;
        this.user = user;
        this.text = text;
    }

    @Override
    public String toString() {
        return "[" + time + "] " + text;
    }
}
