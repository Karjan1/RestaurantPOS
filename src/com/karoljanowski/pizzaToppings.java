package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-12.
 */
public class pizzaToppings {
    private String name;
    private double priceFor1kg;

    public pizzaToppings(String name, double priceFor1kg) {
        this.name = name;
        this.priceFor1kg = priceFor1kg;
    }

    public String getName() {
        return name;
    }

    public double getPriceFor1kg() {
        return priceFor1kg;
    }

    public void setPriceFor1kg(double priceFor1kg) {
        this.priceFor1kg = priceFor1kg;
    }
}
