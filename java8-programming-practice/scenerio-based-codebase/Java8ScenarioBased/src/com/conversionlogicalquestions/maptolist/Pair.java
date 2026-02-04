package com.conversionlogicalquestions.maptolist;

public class Pair {
    private String key;
    private Integer value;

    public Pair(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}