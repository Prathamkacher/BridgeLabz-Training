package com.day_2.songvault;

public class Media<T> {
    T type; // Audio, Video, Podcast

    public Media(T type) {
        this.type = type;
    }
}
