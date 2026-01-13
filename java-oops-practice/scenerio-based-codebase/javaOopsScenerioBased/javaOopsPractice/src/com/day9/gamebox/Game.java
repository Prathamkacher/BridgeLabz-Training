package com.day9.gamebox;

abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    // Paid game constructor
    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    // Free game constructor
    public Game(String title, String genre, double rating) {
        this(title, genre, 0, rating);
    }

    // Seasonal offer
    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);   // operator used
    }

    @Override
    public void download(User user) {
        user.addGame(this);
        System.out.println(title + " downloaded successfully.");
    }

    public String getTitle() {
        return title;
    }
}
