package com.karoljanowski;

import java.util.ArrayList;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Register {
    private String name;
     private double income;
     private ArrayList<OrderPosition> ordersHistory = new ArrayList<>();
//     private ArrayList<OrderPosition> soldSummary = new ArrayList<>();   //FRAGMENT DO POPRAWY. JAK ZSUMOWAC SPRZEDAZ WSZYSTKICH IDENTYCZNYCH PRODUKTOW?



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

    public ArrayList<OrderPosition> getOrdersHistory() {
        return ordersHistory;
    }


}











