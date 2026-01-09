package com.day8.artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price,
                      String licenseType, boolean hasPreview) {
        super(title, artist, price, licenseType, hasPreview);
    }

    @Override
    public void license() {
        System.out.println("Digital Art License: " + licenseType +
                " (Download & Online Use Allowed)" + "\n");
    }
}
