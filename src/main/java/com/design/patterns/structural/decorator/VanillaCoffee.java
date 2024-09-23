package com.design.patterns.structural.decorator;

public class VanillaCoffee implements Coffee {

    private final Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public Double cost() {
        return coffee.cost() + 1.50;
    }
}
