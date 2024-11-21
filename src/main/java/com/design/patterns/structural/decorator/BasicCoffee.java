package com.design.patterns.structural.decorator;

public class BasicCoffee implements Coffee {
    @Override
    public Double cost() {
        return Double.parseDouble("2.99");
    }
}
