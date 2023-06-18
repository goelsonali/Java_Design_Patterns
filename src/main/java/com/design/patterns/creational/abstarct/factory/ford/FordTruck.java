package com.design.patterns.creational.abstarct.factory.ford;

import com.design.patterns.creational.abstarct.factory.Truck;

public class FordTruck implements Truck {
    @Override
    public String truckDetails() {
        return "This is Ford's truck.";
    }
}
