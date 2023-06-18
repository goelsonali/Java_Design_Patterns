package com.design.patterns.creational.abstarct.factory.tata;

import com.design.patterns.creational.abstarct.factory.Truck;

public class TataTruck implements Truck {
    @Override
    public String truckDetails() {
        return "This is Tata's Truck.";
    }
}
