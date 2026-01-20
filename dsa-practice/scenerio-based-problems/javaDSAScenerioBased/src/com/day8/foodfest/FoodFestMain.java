package com.day8.foodfest;

public class FoodFestMain {

    public static void main(String[] args) {

        Stall[] stalls = {
            new Stall("Burger", 120),
            new Stall("Pizza", 90),
            new Stall("Pasta", 60),
            new Stall("Tacos", 130),
            new Stall("Maggie", 180),
            new Stall("Sandwich", 70)
        };

        System.out.println("Before Sorting:");
        for (Stall s : stalls)
            System.out.println(s);

        FoodFest.mergeSort(stalls, 0, stalls.length - 1);

        System.out.println("\nMaster Performance List:");
        for (Stall s : stalls)
            System.out.println(s);
    }
}
