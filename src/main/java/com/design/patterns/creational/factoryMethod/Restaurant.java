package com.design.patterns.creational.factoryMethod;

//Factory Method is a creational design pattern loosens the coupling of a given code
// by separating the product's construction code from the code that uses this code.
//Eg: Problem : Open-close principle is not followed ( new type of burger would require addition of new if condition or creation of the product)
// Restaurant class can have 2 types of burgers veg & non-veg ..Veg and Non-Veg burger can be 2 different classes [products] implementing burger interface.
// So on order request type create or call the veg or non-veg burger class.
//Solution : Creation of the PRODUCT i.e VEG or NON-VEG burger should be moved away from the main class using it.
public abstract class Restaurant {
    public void orderBurger() {
        createBurger().prepare();
    }

    public abstract Burger createBurger();
}
