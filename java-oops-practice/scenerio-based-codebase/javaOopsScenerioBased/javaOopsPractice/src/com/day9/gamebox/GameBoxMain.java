package com.day9.gamebox;

public class GameBoxMain {

    public static void main(String[] args) {

        User user = new User("Pratham");

        Game arcade = new ArcadeGame("Down Hill", 500, 4.5);
        Game strategy = new StrategyGame("God Hand", 800, 4.8);

        // Play demos (polymorphism)
        arcade.playDemo();
        strategy.playDemo();

        // Apply seasonal discount
        arcade.applyDiscount(20);   // 20% off
        strategy.applyDiscount(10); // 10% off

        // Download games
        arcade.download(user);
        strategy.download(user);

        // Show user's library
        user.showLibrary();
    }
}
