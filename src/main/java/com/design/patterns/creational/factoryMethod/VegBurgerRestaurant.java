package com.design.patterns.creational.factoryMethod;

public class VegBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
}
