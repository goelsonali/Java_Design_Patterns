package com.design.patterns.creational.abstarct.factory.tata;

import com.design.patterns.creational.abstarct.factory.Car;
import com.design.patterns.creational.abstarct.factory.Company;
import com.design.patterns.creational.abstarct.factory.Truck;

public class Tata extends Company {
    @Override
    public Car getCar() {
        return new Nano();
    }

    @Override
    public Truck getTruck() {
        return new TataTruck();
    }
}
