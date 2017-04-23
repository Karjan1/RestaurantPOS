package com.karoljanowski;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage("Main storage");
        Menu<Pizza> pizzaMenu = new Menu<>("Pizze");
        storage.addIngredient("Ser",19.90);
        storage.addIngredient("Pieczarki",4.90);
        storage.addIngredient("Szynka",14.90);
        storage.addIngredient("Pomidory",3.90);
        storage.addIngredient("Papryka",15.90);
        storage.addIngredient("Krewetki",15.90);
        storage.addIngredient("Biała mozzarella",15.90);
        storage.addIngredient("Tuńczyk",15.90);
        storage.addIngredient("Suszone pomidory",15.90);
        storage.addIngredient("Kurczak",15.90);
        storage.addIngredient("Salami",15.90);

        AvailiblePizzaToppings.addToppings(storage,"Ser");
        AvailiblePizzaToppings.addToppings(storage,"Pieczarki");
        AvailiblePizzaToppings.addToppings(storage,"Czosnek");
        AvailiblePizzaToppings.addToppings(storage,"Szynka");
        AvailiblePizzaToppings.addToppings(storage,"Pomidory");
        AvailiblePizzaToppings.addToppings(storage,"Krewetki");
        AvailiblePizzaToppings.addToppings(storage,"Biała mozzarella");
        AvailiblePizzaToppings.addToppings(storage,"Kurczak");
        AvailiblePizzaToppings.addToppings(storage,"Suszone pomidory");
        AvailiblePizzaToppings.addToppings(storage,"Salami");

        Pizza margherita = new Pizza(101,"Margherita",8,14,28);
        pizzaMenu.addMenuPosition(margherita);
        margherita.addIngredient("Ser");
        margherita.addIngredient("Pieczarki");
        margherita.addIngredient("Szynka");

        Pizza salame = new Pizza(102, "Salame",10,20,40);
        pizzaMenu.addMenuPosition(salame);
        salame.addIngredient("Ser");
        salame.addIngredient("Pieczarki");
        salame.addIngredient("Salami");
        salame.addIngredient("Pomidory");

        System.out.println(margherita.toString());
        System.out.println(salame.toString());
        System.out.println("---------------");
        System.out.println(pizzaMenu.toString());

    }
//
}
