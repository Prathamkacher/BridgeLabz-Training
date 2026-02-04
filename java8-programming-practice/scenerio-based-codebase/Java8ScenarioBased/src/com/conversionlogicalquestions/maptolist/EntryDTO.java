package com.conversionlogicalquestions.maptolist;

public class EntryDTO {
    private String name;
    private int amount;

    public EntryDTO(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + amount + "]";
    }
}