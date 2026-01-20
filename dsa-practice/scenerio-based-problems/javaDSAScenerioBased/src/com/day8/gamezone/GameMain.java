package com.day8.gamezone;

public class GameMain {

    public static void main(String[] args) {

        Player[] players = {
            new Player("Aman", 1200),
            new Player("Riya", 1800),
            new Player("Karan", 950),
            new Player("Neha", 1600),
            new Player("Arjun", 1400)
        };

        System.out.println("Before Sorting:");
        for (Player p : players)
            System.out.println(p);

        GameZone.quickSort(players, 0, players.length - 1);

        System.out.println("\nLeaderboard:");
        int rank = 1;
        for (Player p : players) {
            System.out.println(rank++ + ". " + p);
        }
    }
}
