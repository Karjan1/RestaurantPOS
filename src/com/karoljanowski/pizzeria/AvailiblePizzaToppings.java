package com.karoljanowski.pizzeria;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Karol Janowski on 2017-04-12.
 */
public class  AvailiblePizzaToppings {
    private static String name = "Pizza Toppings";
    private static Map<String,Storage.Ingredient> availibleToppings = new HashMap<>();

    public static boolean addToppings(Storage storage, String name){
        if (storage.getStoredItems().containsKey(name)) {
            availibleToppings.put(name,storage.getStoredItems().get(name));
            return true;
        }
        System.out.println("W magazynie nie ma: " + name);
        return false;
    }

    public static String getName() {
        return name;
    }

    public static Map<String,Storage.Ingredient> getAvailibleToppings() {
        return availibleToppings;
    }
}
