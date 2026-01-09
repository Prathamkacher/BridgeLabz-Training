/*
 * 19. "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.
 */

package com.day8.artify;

public class ArtifyAppMain {

    public static void main(String[] args) {

        User buyer = new User("Pratham", 5000);

        Artwork digital = new DigitalArt(
                "One Peace",
                "Oda Sensei",
                1500,
                "Standard License",
                true
        );

        Artwork print = new PrintArt(
                "Nature Sketch",
                "Rehman",
                2000,
                "Single Print License"
        );

        digital.purchase(buyer);
        digital.license();

        print.purchase(buyer);
        print.license();

        System.out.println("Remaining Wallet Balance: ₹" +
                buyer.getWalletBalance());
    }
}
