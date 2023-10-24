package com.design.patterns.creational.factoryMethod;

public class NonVegBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Non-Veg Burger");
    }

}
