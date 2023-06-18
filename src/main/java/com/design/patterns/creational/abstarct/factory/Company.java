package com.design.patterns.creational.abstarct.factory;

//Abstract factory design pattern suggests, creating explicit interface for each distinct PRODUCT
public abstract class Company {

    public abstract Car getCar();
    public abstract Truck getTruck();
}
