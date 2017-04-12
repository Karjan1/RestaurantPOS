package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-10.
 */
public class Drinks extends MenuPosition {
    private int index;
    private String name;
    private double price0_2l;
    private double price0_5l;
    private double price1l;

    public Drinks(int index, String name, double priceSmall, double priceMedium, double priceLarge) {
        super(index, name, priceSmall, priceMedium, priceLarge);
        this.index = index;
        this.name = name;
        this.price0_2l = priceSmall;
        this.price0_5l = priceMedium;
        this.price1l = priceLarge;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public double getPrice0_2l() {
        return price0_2l;
    }

    public double getPrice0_5l() {
        return price0_5l;
    }

    public double getPrice1l() {
        return price1l;
    }
}
