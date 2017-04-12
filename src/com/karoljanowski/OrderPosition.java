package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-10.
 */
public class OrderPosition  {
    private int size;
    private int amount;
    private MenuPosition menuPosition;

    public OrderPosition(MenuPosition menuPosition, int size, int amount) {
        this.size = size;
        this.amount = amount;
        this.menuPosition = menuPosition;
    }

    public int getSize() {
        return size;
    }

    public int getAmount() {
        return amount;
    }

    public MenuPosition getMenuPosition() {
        return menuPosition;
    }
}
