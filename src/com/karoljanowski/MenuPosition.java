package com.karoljanowski;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karol Janowski on 2017-04-10.
 */
public abstract class MenuPosition implements Comparable<MenuPosition> {
    private int index;
    private String name;
    private double priceSmall;
    private double priceMedium;
    private double priceLarge;
    private List<Storage.Ingredient> ingredients;


    public MenuPosition(int index, String name, double priceSmall, double priceMedium, double priceLarge) {
        this.index = index;
        this.name = name;
        this.priceSmall = priceSmall;
        this.priceMedium = priceMedium;
        this.priceLarge = priceLarge;
        this.ingredients = new ArrayList<>();

    }


    public int compareTo(MenuPosition position) {
        Integer index=this.index;
        int comparator = index.compareTo(position.getIndex());
            if (comparator==0){
                return this.name.compareTo(position.getName());
            }
        return comparator;
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



    public List<Storage.Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
