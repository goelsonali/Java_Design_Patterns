package com.design.patterns.creational.factoryMethod;

public class VegBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }


}
