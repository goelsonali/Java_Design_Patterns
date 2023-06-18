package com.design.patterns.creational.factoryMethod;

public class NonVegBurger extends Restaurant implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Burger");
    }

    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }
}
