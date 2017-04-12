package com.karoljanowski;

import java.util.ArrayList;

/**
 * Created by Karol Janowski on 2017-04-12.
 */
public class AvailiblePizzaToppings {
    private static String name = "Pizza Toppings";
    private static ArrayList<Ingredient> availibleToppings = new ArrayList<>();

    public boolean addToppings(int i){
        if (availibleToppings.contains(Storage.getStoredItems().get(i))){
            System.out.println("Ingredient already in menu");
            return false;
        }
        availibleToppings.add(Storage.getStoredItems().get(i));
        System.out.println("New pizza topping availible");
        return true;
    }

    public static String getName() {
        return name;
    }

    public static ArrayList<Ingredient> getAvailibleToppings() {
        return availibleToppings;
    }
}
