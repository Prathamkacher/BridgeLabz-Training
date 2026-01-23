package com.day9.musicapp;

import java.util.*;

public class MusicLibraryBST {

    private SongNode root;

    // Scenario 2: Insert new track
    public void insert(int trackId, String title, String artist) {
        root = insertRec(root, trackId, title, artist);
    }

    private SongNode insertRec(SongNode root, int trackId, String title, String artist) {
        if (root == null)
            return new SongNode(trackId, title, artist);

        if (trackId < root.trackId)
            root.left = insertRec(root.left, trackId, title, artist);
        else if (trackId > root.trackId)
            root.right = insertRec(root.right, trackId, title, artist);

        return root;
    }

    // Scenario 1: Search by Track ID
    public void search(int trackId) {
        SongNode result = searchRec(root, trackId);
        if (result != null)
            System.out.println("Found: " + result.title + " by " + result.artist);
        else
            System.out.println("Song not found.");
    }

    private SongNode searchRec(SongNode root, int trackId) {
        if (root == null || root.trackId == trackId)
            return root;

        if (trackId < root.trackId)
            return searchRec(root.left, trackId);

        return searchRec(root.right, trackId);
    }

    // Scenario 3: Show playlist alphabetically by title
    public void displayAlphabetical() {
        List<SongNode> songs = new ArrayList<>();
        collectSongs(root, songs);

        // Sort by title alphabetically
        songs.sort(Comparator.comparing(s -> s.title.toLowerCase()));

        System.out.println("\nPlaylist (Alphabetical Order):");
        for (SongNode s : songs) {
            System.out.println(s.title + " - " + s.artist + " (ID: " + s.trackId + ")");
        }
    }

    // In-order traversal to collect nodes
    private void collectSongs(SongNode root, List<SongNode> list) {
        if (root != null) {
            collectSongs(root.left, list);
            list.add(root);
            collectSongs(root.right, list);
        }
    }
}
