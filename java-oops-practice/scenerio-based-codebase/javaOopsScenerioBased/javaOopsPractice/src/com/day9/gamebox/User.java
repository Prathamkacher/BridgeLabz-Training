package com.day9.gamebox;

import java.util.*;

public class User {

    private String name;
    private List<Game> ownedGames = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    // Only safe way to add game
    public void addGame(Game game) {
        ownedGames.add(game);
    }

    public void showLibrary() {
        System.out.println("\n" + name + "'s Game Library:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.getTitle());
        }
    }
}
