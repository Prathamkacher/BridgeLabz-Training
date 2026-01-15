package com.day10.birdsantuary;

public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(getName() + " flies low.");
    }

    public void swim() {
        System.out.println(getName() + " swims in water.");
    }
}
