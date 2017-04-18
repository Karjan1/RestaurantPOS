package com.karoljanowski;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karol Janowski on 2017-04-12.
 */
public class  AvailiblePizzaToppings {
    private static String name = "Pizza Toppings";
    private static List<Storage.Ingredient> availibleToppings = new ArrayList<>();

    public static boolean addToppings(Storage storage, String name){
        for (Storage.Ingredient ingredient : storage.getStoredItems()){
            if(ingredient.getName().equalsIgnoreCase(name)){
                availibleToppings.add(ingredient);
                return true;
            }
        }
        System.out.println("W magazynie nie ma: " + name);
        return false;
    }

    public static String getName() {
        return name;
    }

    public static List<Storage.Ingredient> getAvailibleToppings() {
        return availibleToppings;
    }
}
