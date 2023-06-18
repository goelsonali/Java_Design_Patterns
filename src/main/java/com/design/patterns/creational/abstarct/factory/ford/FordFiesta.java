package com.design.patterns.creational.abstarct.factory.ford;

import com.design.patterns.creational.abstarct.factory.Car;

public class FordFiesta implements Car {
    @Override
    public String carDetails() {
        return "This is Ford Fiesta, All about family.";
    }
}
