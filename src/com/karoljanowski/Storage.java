package com.karoljanowski;

import java.util.ArrayList;

/**
 * Created by Karol Janowski on 2017-04-13.
 */
public class Storage {


    private static String name = "Main Storage";
    private static ArrayList<Ingredient> storedItems = new ArrayList<>();



    public static boolean addStoragePosition(Ingredient ingredient){
        if (storedItems.contains(ingredient)) {
            System.out.println("Ingredient exists in storage");
            return false;
        }
        storedItems.add(ingredient);
        System.out.println("New ingredient in storage");
        return true;
    }

    public static ArrayList<Ingredient> getStoredItems() {
        return storedItems;
    }
}
