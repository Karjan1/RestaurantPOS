package com.karoljanowski;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Register {
    private String name;
     private double income;
     private List<OrderPosition> ordersHistory = new ArrayList<>();
     private List<OrderPosition> combinedOrders = new ArrayList<>();
     private ArrayList<Ingredient> usedIngredients;  // NIE ZROBIONE. ILE KG PRODUKTOW ZUZYTO-

    private void countIngredientsUsage(){
        usedIngredients = null;
        for (OrderPosition orderPosition : combinedOrders){
            MenuPosition menuPosition= orderPosition.getMenuPosition();
            for (Ingredient ingredient : menuPosition.getIngredients()){
                if (usedIngredients.contains(ingredient)) {
                    ingredient.increaseUsed(orderPosition.getSize());
                } else {
                    usedIngredients.add(ingredient);
                    ingredient.increaseUsed(orderPosition.getSize());
                }
            }
        }
    }

    public void printIngredientUsage(){
        countIngredientsUsage();
        for (Ingredient ingredient : usedIngredients){
            System.out.println(ingredient.getName() + " zuzyto: " + ingredient.getUsed());
        }
    }


    public Register(String name) {
        this.name = name;
    }

    public boolean placeOrder(OrderPosition order){

        switch (order.getSize()){
            case 1:{
                income+=order.getAmount()*order.getMenuPosition().getPriceSmall();
                break;
            }
            case 2:{
                income+=order.getAmount()*order.getMenuPosition().getPriceMedium();
                break;
            }
            case 3:{
                income+=order.getAmount()*order.getMenuPosition().getPriceLarge();
                break;
            }
            default:{
                System.out.println("Proszę wybrać inny rozmiar");
                return false;

            }
        }
        ordersHistory.add(order);
        return true;
        //FRAGMENT DO POPRAWY. JAK ZSUMOWAC SPRZEDAZ WSZYSTKICH IDENTYCZNYCH PRODUKTOW?
//        for ( int i=0; i<this.soldSummary.size() ; i++){  //Merges all similar orders (same position and size) into 1 position.
//            if (order.getMenuPosition().equals(this.soldSummary.get(i).getMenuPosition()) && (order.getSize() == this.soldSummary.get(i).getSize())){
//                this.soldSummary.get(i).increaseAmount(order.getAmount());
//                return true;
//            }
//        }
//        System.out.println("Error. Position should already exist");
//        return false;
 }


    public double getIncome() {
        return income;
    }

    public List<OrderPosition> getOrdersHistory() {
        return ordersHistory;
    }

    public boolean combineOrders(){

        for (OrderPosition order: this.ordersHistory){
            boolean flag = false;
            int size = order.getSize();
            int amount = order.getAmount();
            MenuPosition position = order.getMenuPosition();

            for (OrderPosition aorder: combinedOrders){

                if (size==aorder.getSize() && position==aorder.getMenuPosition()){
                    aorder.increaseAmount(amount);
                    flag=true;
                }

            }
            if (!flag) {
                combinedOrders.add(order);
            }
        }
        return true;
    }

    public void printOrders(){
        System.out.println("Lista zamowien:");
        for (OrderPosition order: this.ordersHistory){
            double price;
            int size=order.getSize();
            switch (size){
                case 1:{
                    price=order.getMenuPosition().getPriceSmall();
                    break;
                }
                case 2:{
                    price=order.getMenuPosition().getPriceMedium();
                    break;
                }
                case 3:{
                    price=order.getMenuPosition().getPriceLarge();
                    break;
                }
                default: {
                    price=0;
                    System.out.println("Error. Print order znalazl zamowienie z niedozwolonym rozmiarem");
                    break;
                }
            }
            System.out.println(order.getMenuPosition().getName()
                    + ", rozmiar: " + size
                    + ", cena: " + price
                    + "zl, ilosc: " + order.getAmount());
        }
        System.out.println("------------------------");
    }

    public void printCombined(){
        combineOrders();
        sortCombined();
        System.out.println("Sprzedano:");
        for (OrderPosition order: this.combinedOrders){
            double price;
            int size=order.getSize();
            switch (size){
                case 1:{
                    price=order.getMenuPosition().getPriceSmall();
                    break;
                }
                case 2:{
                    price=order.getMenuPosition().getPriceMedium();
                    break;
                }
                case 3:{
                    price=order.getMenuPosition().getPriceLarge();
                    break;
                }
                default: {
                    price=0;
                    System.out.println("Error. Print combined znalazl zamowienie z niedozwolonym rozmiarem");
                    break;
                }
            }
            System.out.println(order.getMenuPosition().getName()
                    + ", rozmiar: " + size
                    + ", cena: " + price
                    + "zl, ilosc: " + order.getAmount());
        }
        System.out.println("------------------------");
    }

    public void sortCombined(){
        boolean swapped = false;
        OrderPosition temp;

        for (int i=0; i<(combinedOrders.size()-1); i++ ){

            swapped=false;
            OrderPosition a = combinedOrders.get(i);
            OrderPosition b = combinedOrders.get(i+1);

            if (a.getMenuPosition().getIndex()>b.getMenuPosition().getIndex()){
                temp = combinedOrders.get(i);
                combinedOrders.remove(i);
                combinedOrders.add(i,b);
                combinedOrders.remove(i+1);
                combinedOrders.add(i+1,temp);
                swapped=true;
            }
            if (a.getMenuPosition().getIndex()==b.getMenuPosition().getIndex() && a.getSize()>b.getSize()){
                temp = combinedOrders.get(i);
                combinedOrders.remove(i);
                combinedOrders.add(i,b);
                combinedOrders.remove(i+1);
                combinedOrders.add(i+1,temp);
                swapped=true;
            }
            if (swapped){
                i=-1;
            }
        }
    }



}











