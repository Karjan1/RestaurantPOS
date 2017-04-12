package com.karoljanowski;

import java.util.ArrayList;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Pizza extends MenuPosition{

    private int index;
    private String name;
    private ArrayList<Ingredient> ingredients;
    private double priceSmallPizza;
    private double priceBigPizza;
    private double priceGrandePizza;

    public Pizza(int index, String name, double priceSmall, double priceMedium, double priceLarge) {
        super(index, name, priceSmall, priceMedium, priceLarge);
        this.index = index;
        this.name = name;
        this.ingredients= new ArrayList<>();
        this.priceSmallPizza = priceSmall;
        this.priceBigPizza = priceMedium;
        this.priceGrandePizza = priceLarge;
    }

    public boolean addIngredient(int i){
        this.ingredients.add(AvailiblePizzaToppings.getAvailibleToppings().get(i));
        System.out.println("Ingredient added");
        return true;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public double getPriceSmallPizza() {
        return priceSmallPizza;
    }

    public double getPriceBigPizza() {
        return priceBigPizza;
    }

    public double getPriceGrandePizza() {
        return priceGrandePizza;
    }

    @Override
    public String toString() {
        System.out.println(name + " mala: " + priceSmallPizza + "zł, duza: " + priceBigPizza + "zł, grande: " + priceGrandePizza + "zł");
        for (Ingredient ingre: ingredients){
            System.out.println(ingre.getName());
        }
        System.out.println("--------------");
        return super.toString();
    }
}
