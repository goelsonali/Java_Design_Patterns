package com.design.patterns.creational.builder;

public class Laptop {
    private int id;
    private String brand;
    private String modelName;
    private String colour;

    Laptop(int id, String brand, String modelName, String colour) {
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.colour = colour;
    }

    public int id() {
        return id;
    }

    public String brand() {
        return brand;
    }

    public String modelName() {
        return modelName;
    }

    public String colour() {
        return colour;
    }
}
