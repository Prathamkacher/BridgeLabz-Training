package com.day10.birdsantuary;

public class Eagle extends Bird implements Flyable {
    public Eagle(String id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println(getName() + " is flying high!");
    }
}
