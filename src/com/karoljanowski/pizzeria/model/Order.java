package com.karoljanowski.pizzeria.model;

/**
 * Created by Karol Janowski on 2017-04-29.
 */
public class Order {
    private int id;
    private int clientId;
    private String date;

    public Order(int id, int clientId, String date) {
        this.id = id;
        this.clientId = clientId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", date='" + date + '\'' +
                '}';
    }
}
