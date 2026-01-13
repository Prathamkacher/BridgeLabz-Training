package com.day9.gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println(title + " Demo: Think, plan, and conquer!");
    }
}