package com.karoljanowski;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage("Main storage");
        Menu<Pizza> pizzaMenu = new Menu<>("Pizze");
        storage.addIngredient("Ser",19.90);
        storage.addIngredient("Pieczarki",4.90);
        storage.addIngredient("Szynka",14.90);
        storage.addIngredient("Pomidory",3.90);
        storage.addIngredient("Salami",15.90);

        AvailiblePizzaToppings.addToppings(storage,"ser");
        AvailiblePizzaToppings.addToppings(storage,"pieczarki");
        AvailiblePizzaToppings.addToppings(storage,"czosnek");

        Pizza margherita = new Pizza(101,"Margherita",8,14,28);
        pizzaMenu.addMenuPosition(margherita);
        margherita.addIngredient("ser");
        margherita.addIngredient("pieczarki");
        margherita.addIngredient("szynka");

        System.out.println(margherita.toString());

    }

}
