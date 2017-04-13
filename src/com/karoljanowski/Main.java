package com.karoljanowski;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        Register mainRegister = new Register("Główna");
        AvailiblePizzaToppings availiblePizzaToppings = new AvailiblePizzaToppings();
        Menu<Pizza> pizzaMenu = new Menu("Pizze");
        Menu<Drinks> drinksMenu = new Menu<>("Napoje");

        Drinks cola = new Drinks(201,"coca-cola",4,6,8);
        Drinks sprite = new Drinks(201,"sprite",4,6,8);

        drinksMenu.addMenuPosition(cola);
        drinksMenu.addMenuPosition(sprite);

        storage.addStoragePosition(new Ingredient("Ser",19.90, 0));
        storage.addStoragePosition(new Ingredient("Pulpa pomidorowa",19.90, 0));
        storage.addStoragePosition(new Ingredient("Szynka",14.90, 0));
        storage.addStoragePosition(new Ingredient("Salami",14.90, 0));
        storage.addStoragePosition(new Ingredient("Pieczarki",8.90, 0));
        storage.addStoragePosition(new Ingredient("Pomidory",3.90, 0));

        availiblePizzaToppings.addToppings(1);
        availiblePizzaToppings.addToppings(0);
        availiblePizzaToppings.addToppings(4);
        availiblePizzaToppings.addToppings(2);
        availiblePizzaToppings.addToppings(3);
        availiblePizzaToppings.addToppings(5);

        Pizza margherita = new Pizza(101,"Margherita", 8,21,35);
        margherita.addIngredient(0);
        margherita.addIngredient(1);
        Pizza salame = new Pizza(102,"Salame", 9,24,40);
        salame.addIngredient(0);
        salame.addIngredient(1);
        salame.addIngredient(4);
        Pizza vesuvio = new Pizza(103,"Vesuvio", 10,27,45);
        vesuvio.addIngredient(0);
        vesuvio.addIngredient(1);
        vesuvio.addIngredient(2);
        vesuvio.addIngredient(3);
        Pizza parma = new Pizza(104,"Parma", 11,30,50);
        parma.addIngredient(0);
        parma.addIngredient(1);
        parma.addIngredient(2);
        parma.addIngredient(3);
        parma.addIngredient(4);
        parma.addIngredient(5);

        pizzaMenu.addMenuPosition(margherita);
        pizzaMenu.addMenuPosition(salame);
        pizzaMenu.addMenuPosition(vesuvio);
        pizzaMenu.addMenuPosition(parma);
        pizzaMenu.addMenuPosition(new Pizza(105,"cappriciosa",10,30,50));
        margherita.toString();
        vesuvio.toString();
        salame.toString();
        parma.toString();

        mainRegister.placeOrder(new OrderPosition(sprite,1,5));
        mainRegister.placeOrder(new OrderPosition(sprite,2,5));

        mainRegister.placeOrder(new OrderPosition(salame,2,3));
        mainRegister.placeOrder(new OrderPosition(vesuvio,1,2));
        mainRegister.placeOrder(new OrderPosition(parma,1,1));
        mainRegister.placeOrder(new OrderPosition(parma,2,1));
        mainRegister.placeOrder(new OrderPosition(parma,3,1));
        mainRegister.placeOrder(new OrderPosition(sprite,3,5));
        mainRegister.placeOrder(new OrderPosition(sprite,2,5));
        mainRegister.placeOrder(new OrderPosition(salame,1,2));
        mainRegister.placeOrder(new OrderPosition(salame,3,2));
        System.out.println(mainRegister.getIncome());
        mainRegister.printOrders();
        mainRegister.printCombined();



    }

}
