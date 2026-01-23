package com.day9.musicapp;

public class SongNode {
    int trackId;
    String title;
    String artist;

    SongNode left, right;

    public SongNode(int trackId, String title, String artist) {
        this.trackId = trackId;
        this.title = title;
        this.artist = artist;
    }
}
