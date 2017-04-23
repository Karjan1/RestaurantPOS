package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-10.
 */
public class Drink extends MenuPosition {
    private int index;
    private String name;
    private double price0_2l;
    private double price0_5l;
    private double price1l;

    public Drink(int index, String name, double priceSmall, double priceMedium, double priceLarge) {
        super(index, name, priceSmall, priceMedium, priceLarge);
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }


}
