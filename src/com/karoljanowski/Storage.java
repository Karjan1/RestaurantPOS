package com.karoljanowski;

import java.util.ArrayList;

/**
 * Created by Karol Janowski on 2017-04-13.
 */
public class Storage {


    private  String name;
    private  ArrayList<Ingredient> storedItems = new ArrayList<>();

    public Storage(String name) {
        this.name = name;
    }

    public void addIngredient(String name, double price){
        this.storedItems.add(new Ingredient(name,price));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getStoredItems() {
        return storedItems;
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
             return name;
         }
     }

}
