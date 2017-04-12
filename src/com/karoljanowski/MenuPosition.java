package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-10.
 */
public abstract class MenuPosition {
    private int index;
    private String name;
    private double priceSmall;
    private double priceMedium;
    private double priceLarge;

    public MenuPosition(int index, String name, double priceSmall, double priceMedium, double priceLarge) {
        this.index = index;
        this.name = name;
        this.priceSmall = priceSmall;
        this.priceMedium = priceMedium;
        this.priceLarge = priceLarge;

    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public double getPriceSmall() {
        return priceSmall;
    }

    public double getPriceMedium() {
        return priceMedium;
    }

    public double getPriceLarge() {
        return priceLarge;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
