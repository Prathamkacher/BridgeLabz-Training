package com.day10.gamingapp;

public class Main {
    public static void main(String[] args) {

        LeaderBoardAVL lb = new LeaderBoardAVL();

        lb.insert(1, "Pratham", 2200);
        lb.insert(2, "prashant", 1500);
        lb.insert(3, "Priya", 1800);
        lb.insert(4, "Gautam", 1100);
        lb.insert(5, "Krishna", 1600);

        lb.showTopPlayers(3);

        lb.clearLeaderboard();
    }
}
