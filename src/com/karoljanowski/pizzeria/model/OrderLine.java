package com.karoljanowski.pizzeria.model;

/**
 * Created by Karol Janowski on 2017-04-29.
 */
public class OrderLine {
    private int id;
    private int orderId;
    private int menuPositionId;
    private int size;
    private int amount;

    public OrderLine(int id, int orderId, int menuPositionId, int size, int amount) {
        this.id = id;
        this.orderId = orderId;
        this.menuPositionId = menuPositionId;
        this.size = size;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMenuPositionId() {
        return menuPositionId;
    }

    public void setMenuPositionId(int menuPositionId) {
        this.menuPositionId = menuPositionId;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", menuPositionId=" + menuPositionId +
                ", size=" + size +
                ", amount=" + amount +
                '}';
    }
}
