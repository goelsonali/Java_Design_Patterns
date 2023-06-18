package com.design.patterns.creational.factoryMethod;

public class NonVegBurgerRestaurant extends Restaurant{
    @Override
    public Burger createBurger() {
        return new NonVegBurger();
    }
}
