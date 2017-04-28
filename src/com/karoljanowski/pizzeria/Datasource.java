package com.karoljanowski.pizzeria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Karol Janowski on 2017-04-27.
 */
public class Datasource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:" + DB_NAME;


    public static final String TABLE_STORAGES = "storages";
    public static final String COLUMN_STORAGE_ID = "_id";
    public static final String COLUMN_STORAGE_NAME = "name";
    public static final int INDEX_STORAGE_ID = 1;
    public static final int INDEX_STORAGE_NAME = 2;

    public static final String TABLE_REGISTERS = "registers";
    public static final String COLUMN_REGISTER_ID = "_id";
    public static final String COLUMN_REGISTER_NAME = "name";
    public static final int INDEX_REGISTER_ID = 1;
    public static final int INDEX_REGISTER_NAME = 2;

    public static final String TABLE_BASKETS = "baskets";
    public static final String COLUMN_BASKET_ID = "_id";
    public static final String COLUMN_BASKET_NAME = "name";
    public static final String COLUMN_BASKET_VALUE = "value";
    public static final int INDEX_BASKET_ID = 1;
    public static final int INDEX_BASKET_NAME = 2;
    public static final int INDEX_BASKET_VALUE = 3;

    public static final String TABLE_MENUS = "menus";
    public static final String COLUMN_MENU_ID = "_id";
    public static final String COLUMN_MENU_NAME = "name";
    public static final int INDEX_MENU_ID = 1;
    public static final int INDEX_MENU_NAME = 2;

    public static final String TABLE_PIZZAS = "pizzas";
    public static final String COLUMN_PIZZA_ID = "_id";
    public static final String COLUMN_PIZZA_NAME = "name";
    public static final String COLUMN_PIZZA_VALUE = "value";
    public static final int INDEX_PIZZA_ID = 1;
    public static final int INDEX_PIZZA_NAME = 2;
    public static final int INDEX_PIZZA_VALUE = 3;

    public static final String TABLE_INGREDIENTS = "ingredients";
    public static final String COLUMN_INGREDIENT_ID = "_id";
    public static final String COLUMN_INGREDIENT_NAME = "name";
    public static final String COLUMN_INGREDIENT_PRICE = "price";
    public static final String COLUMN_INGREDIENT_BOUGHT = "bought";
    public static final String COLUMN_INGREDIENT_USED = "used";
    public static final int INDEX_INGREDIENT_ID = 1;
    public static final int INDEX_INGREDIENT_NAME = 2;
    public static final int INDEX_INGREDIENT_PRICE = 3;
    public static final int INDEX_INGREDIENT_BOUGHT = 4;
    public static final int INDEX_INGREDIENT_USED = 5;

    public static final String TABLE_DRINKS = "drinks";
    public static final String COLUMN_DRINK_ID = "_id";
    public static final String COLUMN_DRINK_NAME = "name";
    public static final int INDEX_DRINK_ID = 1;
    public static final int INDEX_DRINK_NAME = 2;

    public static final String TABLE_PIZZATOPPINGS = "pizzaToppings";
    public static final String COLUMN_PIZZATOPPING_ID = "_id";
    public static final String COLUMN_PIZZATOPPING_NAME = "name";
    public static final int INDEX_PIZZATOPPING_ID = 1;
    public static final int INDEX_PIZZATOPPING_NAME = 2;

    private Connection conn;

    public Datasource() {
        createTables();
    }

    public void createTables(){

        try {
            open();
            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_STORAGES + " (" + COLUMN_STORAGE_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_STORAGE_NAME + " TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_REGISTERS + " (" + COLUMN_REGISTER_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_REGISTER_NAME + " TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_MENUS + " (" + COLUMN_MENU_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_MENU_NAME + " TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_DRINKS + " (" + COLUMN_DRINK_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_DRINK_NAME + " TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_PIZZATOPPINGS + " (" + COLUMN_PIZZATOPPING_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_PIZZATOPPING_NAME + " TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_INGREDIENTS + " (" + COLUMN_INGREDIENT_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_INGREDIENT_NAME + " TEXT," + COLUMN_INGREDIENT_PRICE + " REAL, " + COLUMN_INGREDIENT_BOUGHT + " REAL, " + COLUMN_INGREDIENT_USED + " REAL)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_BASKETS + " (" + COLUMN_BASKET_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_BASKET_NAME + " TEXT, " + COLUMN_BASKET_VALUE + " DOUBLE)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_PIZZAS + " (" + COLUMN_PIZZA_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_PIZZA_NAME + " TEXT, " + COLUMN_PIZZA_VALUE + " DOUBLE)");

            statement.close();
            close();
        } catch (SQLException e) {
            System.err.println("Connection problem " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
        }
    }

    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }


}


















