package com.design.patterns.creational.prototype;

public class Dress implements Prototype {

    private String barcode;
    private String colour;
    private String size;

    public Dress(String barcode, String colour, String size) {
        this.barcode = barcode;
        this.colour = colour;
        this.size = size;
    }

    Dress(Dress dress) {
        this.barcode = dress.barcode;
        this.colour = dress.colour;
        this.size = dress.size;
    }

    //Here implementing this clone method will copy the current values of object this to new object and returned.
    @Override
    public Dress clone() {
        return new Dress(this);
    }

    public String barcode() {
        return barcode;
    }

    public String colour() {
        return colour;
    }

    public String size() {
        return size;
    }
}
