/*
 * 7. TrafficManager – Roundabout Vehicle Flow (Circular Linked List +
Queue)
Story: A smart city roundabout allows vehicles to enter and exit dynamically. Each vehicle is a
node in a Circular Linked List. A Queue manages vehicles waiting to enter.
Requirements:
● Add or remove cars in a circular path.
● Queue overflow/underflow handling.
● Print state of roundabout at any time.
 */

package com.day2.trafficmanager;

public class TrafficManagerMain {

    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();

        tm.addToQueue("Car1");
        tm.addToQueue("Car2");
        tm.addToQueue("Car3");
        tm.addToQueue("Car4"); // overflow

        tm.enterRoundabout();
        tm.enterRoundabout();
        tm.enterRoundabout();
        tm.enterRoundabout();  // underflow

        tm.displayRoundabout();

        tm.exitRoundabout("Car2");
        tm.displayRoundabout();
    }
}
