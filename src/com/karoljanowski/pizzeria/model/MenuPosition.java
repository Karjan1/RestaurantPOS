package com.karoljanowski.pizzeria.model;

/**
 * Created by Karol Janowski on 2017-04-29.
 */
public class MenuPosition {
    private int id;
    private String name;
    private String type;
    private double priceSmall;
    private double priceMedium;
    private double priceLarge;

    public MenuPosition(int id, String name, String type, double priceSmall, double priceMedium, double priceLarge) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.priceSmall = priceSmall;
        this.priceMedium = priceMedium;
        this.priceLarge = priceLarge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPriceSmall() {
        return priceSmall;
    }

    public void setPriceSmall(double priceSmall) {
        this.priceSmall = priceSmall;
    }

    public double getPriceMedium() {
        return priceMedium;
    }

    public void setPriceMedium(double priceMedium) {
        this.priceMedium = priceMedium;
    }

    public double getPriceLarge() {
        return priceLarge;
    }

    public void setPriceLarge(double priceLarge) {
        this.priceLarge = priceLarge;
    }

    @Override
    public String toString() {
        return "MenuPosition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", priceSmall=" + priceSmall +
                ", priceMedium=" + priceMedium +
                ", priceLarge=" + priceLarge +
                '}';
    }
}
