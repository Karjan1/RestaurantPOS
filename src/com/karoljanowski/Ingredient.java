package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-13.
 */
public class Ingredient {
    private String name;
    private double priceFor1kg;
    private double storedAmount;

    public Ingredient(String name, double priceFor1kg, double storedAmount) {
        this.name = name;
        this.priceFor1kg = priceFor1kg;
        this.storedAmount = 0;
    }

    public String getName() {
        return name;
    }

    public double getPriceFor1kg() {
        return priceFor1kg;
    }

    public double getStoredAmount() {
        return storedAmount;
    }
}
