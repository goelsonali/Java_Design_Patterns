package com.design.patterns.creational.builder;

//Builder design pattern, extracts the creation of an object of a class outside of its own class and moves to a separate objects builders.
public class LaptopBuilder {

    private int id;
    private String brand;
    private String modelName;
    private String colour;

    //Now each setter method corresponds to little builder methods

    public LaptopBuilder id(int id) {
        this.id = id;
        return this;
    }
    public LaptopBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }
    public LaptopBuilder modelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public LaptopBuilder colour(String colour) {
        this.colour = colour;
        return this;
    }

    public Laptop build() {
        return new Laptop(id,brand,modelName,colour);
    }
}
