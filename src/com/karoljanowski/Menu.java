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
}
