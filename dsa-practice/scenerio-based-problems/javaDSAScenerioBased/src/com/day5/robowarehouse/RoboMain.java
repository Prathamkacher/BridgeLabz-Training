/*
 * 6. RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions
 */

package com.day5.robowarehouse;

public class RoboMain {

    public static void main(String[] args) {

        RoboWareHouse robot = new RoboWareHouse();

        robot.addPackage(10);
        robot.displayShelf();

        robot.addPackage(20);
        robot.displayShelf();

        robot.addPackage(15);
        robot.displayShelf();

        robot.addPackage(5);
        robot.displayShelf();
    }
}
