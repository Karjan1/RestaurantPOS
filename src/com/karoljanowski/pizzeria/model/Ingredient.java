package com.karoljanowski.pizzeria.model;

/**
 * Created by Karol Janowski on 2017-04-29.
 */
public class Ingredient {
    private int id;
    private String name;
    private boolean ingForPizza;
    private boolean ingForPasta;
    private boolean ingForDrinks;

    public Ingredient(int id, String name, boolean ingForPizza, boolean ingForPasta, boolean ingForDrinks) {
        this.id = id;
        this.name = name;
        this.ingForPizza = ingForPizza;
        this.ingForPasta = ingForPasta;
        this.ingForDrinks = ingForDrinks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIngForPizza() {
        return ingForPizza;
    }

    public void setIngForPizza(boolean ingForPizza) {
        this.ingForPizza = ingForPizza;
    }

    public boolean isIngForPasta() {
        return ingForPasta;
    }

    public void setIngForPasta(boolean ingForPasta) {
        this.ingForPasta = ingForPasta;
    }

    public boolean isIngForDrinks() {
        return ingForDrinks;
    }

    public void setIngForDrinks(boolean ingForDrinks) {
        this.ingForDrinks = ingForDrinks;
    }

    @Override
    public String toString() {
        return  id + ": " + name;
    }
}
