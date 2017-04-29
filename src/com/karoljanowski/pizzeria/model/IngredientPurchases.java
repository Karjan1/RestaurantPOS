package com.karoljanowski.pizzeria.model;

/**
 * Created by Karol Janowski on 2017-04-29.
 */
public class IngredientPurchases {
    private int id;
    private int ingredientId;
    private String date;
    private double amount;
    private double price;

    public IngredientPurchases(int id, int ingredientId, String date, double amount, double price) {
        this.id = id;
        this.ingredientId = ingredientId;
        this.date = date;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "IngredientPurchases{" +
                "id=" + id +
                ", ingredientId=" + ingredientId +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
