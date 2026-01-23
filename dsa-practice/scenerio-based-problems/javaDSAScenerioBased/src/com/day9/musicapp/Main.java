package com.day9.musicapp;

public class Main {

    public static void main(String[] args) {

        MusicLibraryBST library = new MusicLibraryBST();

        // Insert songs
        library.insert(105, "Believer", "Imagine Dragons");
        library.insert(101, "Shape of You", "Ed Sheeran");
        library.insert(110, "Closer", "Chainsmokers");
        library.insert(103, "Attention", "Charlie Puth");

        // Search song
        library.search(103);
        library.search(999);

        // Display playlist alphabetically
        library.displayAlphabetical();
    }
}
