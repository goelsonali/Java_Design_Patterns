package com.design.patterns.creational.abstarct.factory.ford;

import com.design.patterns.creational.abstarct.factory.Car;
import com.design.patterns.creational.abstarct.factory.Company;
import com.design.patterns.creational.abstarct.factory.Truck;

public class Ford extends Company {
    @Override
    public Car getCar() {
        return new FordFiesta();
    }

    @Override
    public Truck getTruck() {
        return new FordTruck();
    }
}
