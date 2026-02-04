package com.conversionlogicalquestions.listtomap;

public class Product {
    private String code;
    private String name;

    public Product(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return name;
    }
}