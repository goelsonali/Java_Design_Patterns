package com.design.patterns.structural.decorator;

public class CoffeeService {

    public static void main(String[] args) {
        //Order a basic coffee without any milk
        Coffee coffeeOrder1 = new BasicCoffee();
        System.out.println("Price for the basic coffee " + coffeeOrder1.cost());

        //Order a coffee with WholeMilk and Vanilla syrup
        Coffee coffeeOrder2 = new VanillaCoffee(new WholeMilkCoffee(new BasicCoffee()));
        System.out.println("Price for the whole milk added vanilla coffee " + coffeeOrder2.cost());

        //Order a coffee with OatsMilk
        Coffee coffeeOrder3 = new OatsMilkCoffee(new BasicCoffee());
        System.out.println("Price for the whole milk added vanilla coffee " + coffeeOrder3.cost());
    }


}
