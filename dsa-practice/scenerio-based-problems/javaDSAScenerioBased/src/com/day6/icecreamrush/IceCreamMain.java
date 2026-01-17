package com.day6.icecreamrush;

public class IceCreamMain {

    public static void main(String[] args) {

        Flavor[] flavors = {
            new Flavor("Vanilla", 45),
            new Flavor("Chocolate", 80),
            new Flavor("Mango", 30),
            new Flavor("Strawberry", 60),
            new Flavor("Butterscotch", 55),
            new Flavor("Pista", 25),
            new Flavor("Black Currant", 40),
            new Flavor("Coffee", 50)
        };

        System.out.println("Before Sorting:");
        for (Flavor f : flavors)
            System.out.println(f);

        IceCreamRush.bubbleSort(flavors);

        System.out.println("\nAfter Sorting (By Popularity):");
        for (Flavor f : flavors)
            System.out.println(f);
    }
}
