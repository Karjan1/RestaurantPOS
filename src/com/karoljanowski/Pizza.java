package com.karoljanowski;

import java.util.List;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Pizza extends MenuPosition {

    private int index;
    private String name;
    private List<Storage.Ingredient> ingredients;
    private double priceSmallPizza;
    private double priceBigPizza;
    private double priceGrandePizza;

    public Pizza(int index, String name, double priceSmall, double priceMedium, double priceLarge) {
        super(index, name, priceSmall, priceMedium, priceLarge);
        this.index = index;
        this.name = name;
        this.priceSmallPizza = priceSmall;
        this.priceBigPizza = priceMedium;
        this.priceGrandePizza = priceLarge;
        this.ingredients = super.getIngredients();
    }

    public boolean addIngredient(String name){
        for (Storage.Ingredient ingredient : AvailiblePizzaToppings.getAvailibleToppings()){
            if(ingredient.getName().equalsIgnoreCase(name)){
                this.ingredients.add(ingredient);
                return true;
            }
        }
        System.out.println("Nie serwujemy pizzy z:" + name);
        return false;
    }



    public int compareTo(Pizza pizza) {
        return super.compareTo(pizza);
    }

    @Override
    public String toString() {
        return "Pizza{" + name +
                ", priceSmallPizza=" + priceSmallPizza +
                ", priceBigPizza=" + priceBigPizza +
                ", priceGrandePizza=" + priceGrandePizza +
                "\nskladniki:" + ingredients.toString() +
                '}';
    }
}
