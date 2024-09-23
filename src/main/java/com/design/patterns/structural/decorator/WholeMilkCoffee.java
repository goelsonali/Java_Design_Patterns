package com.design.patterns.structural.decorator;

public class WholeMilkCoffee implements Coffee{

    private final Coffee coffee;
    public WholeMilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public Double cost() {
        return coffee.cost() + 1.0;
    }
}
