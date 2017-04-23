package com.karoljanowski;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Menu<T extends MenuPosition> {
    private String name;
    private Map<String,T> categoryMenu;
//    private static int categoryIterator=0; // First product in each category starts with a 100 multiplied by categoryIterator. So each "100" contains only similar products.
//    private int categoryIndex;



    public Menu(String name) {
//        categoryIndex=categoryIterator;
//        categoryIterator++;
        categoryMenu = new HashMap<>();
        this.name = name;
    }

    public boolean addMenuPosition(T item){
        if (categoryMenu.containsKey(item.getName())){
            System.out.println(item.getName() + " istnieje już w menu");
            return false;
        }
        categoryMenu.put(item.getName(),item);
        return true;
    }
    public  Map<String,T> getCategoryMenu() {
        return categoryMenu;
    }

    public  int categoryProductCount(){
        return categoryMenu.size();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": \n" +
                categoryMenu ;
    }
}
