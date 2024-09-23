package com.design.patterns.structural.decorator;

public class BasicCoffee implements Coffee {
    @Override
    public Double cost() {
        return new Double("2.99");
    }
}
