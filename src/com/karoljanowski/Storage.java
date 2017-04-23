package com.karoljanowski;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Karol Janowski on 2017-04-13.
 */
public class Storage {


    private  String name;
    private Map<String,Ingredient> storedItems = new HashMap<>();

    public Storage(String name) {
        this.name = name;
    }

    public boolean addIngredient(String name, double price){
        if (this.storedItems.containsKey(name)){
            System.out.println("Składnik o tej nazwie już istnieje.");
            return false;
        }
        this.storedItems.put(name,new Ingredient(name,price));
        return true;
    }

    public String getName() {
        return name;
    }

    public Map<String,Ingredient> getStoredItems() {
        return (storedItems);
    }

     class Ingredient{
        String name;
        double price;
        double bought=0;
        double used=0;

        public Ingredient(String name, double price) {
            this.name = name;
            this.price = price;
        }


        public int compareTo(Ingredient ingredient) {
            if (this.name.compareTo(ingredient.getName())==0){
                Double price=this.price;
                return price.compareTo(ingredient.getPrice());
            }
            return this.name.compareTo(ingredient.getName());

        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public double getBought() {
            return bought;
        }

        public double getUsed() {
            return used;
        }

         @Override
         public String toString() {
             return name ;
         }
     }

}
