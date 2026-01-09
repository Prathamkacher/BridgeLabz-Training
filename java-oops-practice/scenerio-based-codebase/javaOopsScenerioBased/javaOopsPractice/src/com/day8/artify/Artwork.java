package com.day8.artify;

abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType; // protected licensing terms

    private boolean hasPreview;

    // Constructor without preview
    protected Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = false;
    }

    // Constructor with preview
    protected Artwork(String title, String artist, double price,
                      String licenseType, boolean hasPreview) {
        this(title, artist, price, licenseType);
        this.hasPreview = hasPreview;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);   // operator used
            System.out.println(user.getName() + " purchased " + title);
        } else {
            System.out.println("Insufficient balance to purchase " + title);
        }
    }
}
