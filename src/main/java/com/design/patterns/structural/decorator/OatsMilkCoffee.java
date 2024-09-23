package com.design.patterns.structural.decorator;

public class OatsMilkCoffee implements Coffee {

    private final Coffee coffee;

    public OatsMilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public Double cost() {
        return coffee.cost() + 2.0;
    }
}
