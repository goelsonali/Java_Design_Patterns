package com.design.patterns.creational.builder;

public class AppleLaptop {

    public Laptop constructLaptopWithBrand() {
        Laptop appleLaptop = new LaptopBuilder()
                .id(1)
                .brand("Apple")
                .modelName("MAC Pro")
                .colour("Grey")
                .build();
        return appleLaptop;
    }
    public Laptop constructLaptopWithoutBrand() {
        Laptop appleLaptop = new LaptopBuilder()
                .id(1)
                .modelName("Basic")
                .colour("Grey")
                .build();
        return appleLaptop;
    }
}
