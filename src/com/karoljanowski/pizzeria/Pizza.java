package com.karoljanowski.pizzeria;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Pizza extends MenuPosition {

    private int index;
    private String name;
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
    }

    public boolean addIngredient(String name){
        if (AvailiblePizzaToppings.getAvailibleToppings().containsKey(name)){
            super.getIngredients().put(name,AvailiblePizzaToppings.getAvailibleToppings().get(name));
            return true;
        }
        System.out.println("Nie serwujemy pizzy z:" + name);
        return false;
    }



    public int compareTo(Pizza pizza) {
        return super.compareTo(pizza);
    }

    @Override
    public String toString() {
        return  name +
                ", Mała=" + priceSmallPizza +
                ", Duża=" + priceBigPizza +
                ", Grande=" + priceGrandePizza +
                "\nSkladniki:" + super.getIngredients().keySet() +
                "\n";
    }
}
