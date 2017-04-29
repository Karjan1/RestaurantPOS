package com.karoljanowski.pizzeria.model;

/**
 * Created by Karol Janowski on 2017-04-29.
 */
public class Client {
    private int id;

    public Client(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                '}';
    }
}
