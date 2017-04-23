package com.karoljanowski;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karol Janowski on 2017-04-23.
 */
public class Basket {
    private List<OrderedPosition> inBasket;
    double value;

    public Basket() {
        this.inBasket= new ArrayList<>();
        this.value=0;
    }


    public Basket(Basket basket) {  //made to remove connectionnof old basket with register
        this.inBasket= basket.inBasket;
        this.value=basket.value;
    }

    public boolean addToBasket(Menu menu,String name, MenuPosition.Size size,int amount){
        double price=0;
        if (!(menu.getCategoryMenu().get(name) instanceof MenuPosition)){return false;}
        MenuPosition menuPosition = (MenuPosition) menu.getCategoryMenu().get(name);

        if (size== MenuPosition.Size.SMALL){price=menuPosition.getPriceSmall();}
        if (size== MenuPosition.Size.MEDIUM){price=menuPosition.getPriceMedium();}
        if (size== MenuPosition.Size.LARGE){price=menuPosition.getPriceLarge();}
        if (price==0){
            System.out.println("Niedostepny rozmiar");
            return false;
        }
        inBasket.add(new OrderedPosition(menuPosition, size,amount));
        value+=(price*amount);
        return true;
    }

    public void closeBasket(){
        this.value=0;
        this.inBasket = new ArrayList<>();
    }

    public List<OrderedPosition> getInBasket() {
        return inBasket;
    }

    @Override
    public String toString() {
        return
                "W koszyku:" + inBasket + "\nWartość: " + value;
    }

    private class OrderedPosition{
        private MenuPosition menuPosition;
        private MenuPosition.Size size;
        private int amount;

        public OrderedPosition(MenuPosition menuPosition, MenuPosition.Size size, int amount) {
            this.menuPosition = menuPosition;
            this.size = size;
            this.amount = amount;
        }

        public MenuPosition getMenuPosition() {
            return menuPosition;
        }

        public MenuPosition.Size getSize() {
            return size;
        }

        public int getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "\n" +
                     menuPosition.getName() +
                    ", rozmiar: " + size +
                    ", ilość: " + amount;
        }
    }
}
