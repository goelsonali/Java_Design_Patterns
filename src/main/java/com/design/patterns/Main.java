package com.design.patterns;

import com.design.patterns.creational.abstarct.factory.Company;
import com.design.patterns.creational.abstarct.factory.ford.Ford;
import com.design.patterns.creational.abstarct.factory.tata.Tata;
import com.design.patterns.creational.builder.AppleLaptop;
import com.design.patterns.creational.builder.Laptop;
import com.design.patterns.creational.factoryMethod.*;
import com.design.patterns.creational.singleton.SingleWithMultiThread;
import com.design.patterns.creational.singleton.SingleWithNonThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Factory Method Pattern
        Restaurant vegBurger = new VegBurgerRestaurant();
        vegBurger.orderBurger();
        Restaurant nonVegBurger = new NonVegBurgerRestaurant();
        nonVegBurger.orderBurger();

        //Singleton pattern for non threaded app
        SingleWithNonThread s1 = SingleWithNonThread.getInstance("Single Instance 1");
        System.out.println(s1.getData());
        SingleWithNonThread s2 = SingleWithNonThread.getInstance("Single Instance 2");
        System.out.println(s2.getData());

        //Output for the above always return
        // Single Instance 1
        // Single Instance 1
        // the 2nd Instance s2 will never be initialised hence - Single Instance 2 will never be printed

        //Singleton pattern for threaded app
        Thread t1 = new Thread(() -> {
            SingleWithMultiThread s11 = SingleWithMultiThread.getInstance("Thread 1 invoking instance");
            System.out.println(s11.getData());
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            SingleWithMultiThread s21 = SingleWithMultiThread.getInstance("Thread 2 invoking instance");
            System.out.println(s21.getData());
        });

        t1.start();
        Thread.sleep(200);
        t2.start();

        //Abstract Factory Example
        Company brandFord = new Ford();
        Company brandTata = new Tata();

        System.out.println("******* Cars Available from different brands *******");
        System.out.println(brandFord.getCar().carDetails());
        System.out.println(brandTata.getCar().carDetails());

        System.out.println("******* Trucks Available from different brands *******");
        System.out.println(brandFord.getTruck().truckDetails());
        System.out.println(brandTata.getTruck().truckDetails());

        //Builder Pattern
        Laptop appleLaptop = new AppleLaptop().constructLaptopWithBrand();
        System.out.println("Get the laptop brand : " + appleLaptop.brand());
        System.out.println("Get the laptop model : " + appleLaptop.modelName());
        Laptop basicLaptop = new AppleLaptop().constructLaptopWithoutBrand();
        System.out.println("Get the laptop brand : " + basicLaptop.brand());
        System.out.println("Get the laptop model : " + basicLaptop.modelName());
    }
}