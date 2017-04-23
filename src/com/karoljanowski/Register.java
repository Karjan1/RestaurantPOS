package com.karoljanowski;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Register {
    private final String name;
    private final List<Basket> ordersHistory;

    public Register(String name) {
        this.name = name;
        ordersHistory = new ArrayList<>();
    }

    public boolean finalizeOrder(Basket basket){
        Basket tempBasket = new Basket(basket);
        ordersHistory.add(tempBasket);
        basket.closeBasket();
        return true;
    }

    @Override
    public String toString() {
        return name + "\n" +
                "historia zamówień:\n" + ordersHistory +
                '}';
    }
}











