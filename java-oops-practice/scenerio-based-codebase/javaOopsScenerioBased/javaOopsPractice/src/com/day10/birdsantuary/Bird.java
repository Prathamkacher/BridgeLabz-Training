package com.day10.birdsantuary;

abstract class Bird {

    private String id;
    private String name;
    private String species;

    public Bird(String id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecies() { return species; }

    public void display() {
        System.out.println(id + " | " + name + " | " + species);
    }
}
