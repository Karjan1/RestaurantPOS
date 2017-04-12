package com.karoljanowski;

import java.util.ArrayList;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Menu<T extends MenuPosition> {
    private String name;
    private  ArrayList<T> categoryMenu;
//    private static int categoryIterator=0; // First product in each category starts with a 100 multiplied by categoryIterator. So each "100" contains only similar products.
//    private int categoryIndex;



    public Menu(String name) {
//        categoryIndex=categoryIterator;
//        categoryIterator++;
        categoryMenu = new ArrayList<>();
        this.name = name;
    }

    public boolean addMenuPosition(T item){
        if (categoryMenu.contains(item)){
            System.out.println("Ten produkt jest już w menu");
            return false;
        }else {
            categoryMenu.add(item);
            return true;
        }
    }
    public  ArrayList<T> getCategoryMenu() {
        return categoryMenu;
    }

    public  int categoryProductCount(){
        return categoryMenu.size();
    }

    public String getName() {
        return name;
    }

    //    public  void printMenu(){
//        int i=0;
//        for (Pizza pizza: categoryMenu){
//            i++;
//            System.out.println(i+". " + pizza.getName() + ": Mala-" + pizza.getPriceSmallPizza() + ", Duza-" + pizza.getPriceBigPizza() + ", Grande-" + pizza.getPriceGrandePizza());
//        }
//    }

//
//    public static ArrayList<Pizza> createPizzaMenu(){
//        ArrayList<Pizza> menuPizz= new ArrayList<>();
//
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,1,"Margherita",8,12,22));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,2,"Capricciosa",11,18,34));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,3,"Hawaii",12 ,20,38));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,4,"Caprese",12 ,20,38));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,5,"Pollo",13,22,42));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,6,"Quatro Fromaggi",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,7,"Diavola",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,8,"Vegetariana",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,9,"Parma",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,10,"Tivoli",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,11,"Pancetta",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,12,"Pollo e Spinaci",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,13,"Mare",14,24,36));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,14,"Inferno",16,28,49));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,15,"Carne",16,28,49));
//        menuPizz.add(new Pizza(true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,16,"Amore",16,28,49));
//        return menuPizz;
//    }
}
