package com.karoljanowski;

public class Main {

    public static void main(String[] args) {
        Register mainRegister = new Register("Główna");
        Menu<Pizza> pizzaMenu = new Menu("Pizze");
        Menu<Drinks> drinksMenu = new Menu<>("Napoje");

        Pizza margherita = new Pizza(1,"Margherita",8,12,22,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false);
        pizzaMenu.addMenuPosition(margherita);
        System.out.println();
        System.out.println(pizzaMenu.categoryProductCount());
        mainRegister.placeOrder(new OrderPosition(margherita,2,2));
        mainRegister.placeOrder(new OrderPosition(margherita,1,2));
        System.out.println("Pierwszym zamowieniem byla: " + mainRegister.getOrdersHistory().get(0).getMenuPosition().getName() + " w ilości: " + mainRegister.getOrdersHistory().get(0).getAmount() + " i wielkości: " + mainRegister.getOrdersHistory().get(0).getSize());
        System.out.println("Wartość sprzedaży: " + mainRegister.getIncome());
//        Menu.printMenu();
//        Register.order(5,1,1);
//        Register.order(5,2,10);
//        Register.order(5,3,7);
//        System.out.println(Register.getIncome());
//        System.out.println(Register.getData().toString());
    }
}
