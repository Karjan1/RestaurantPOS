package com.karoljanowski.pizzeria.model;

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

    private Connection conn;
    private Statement statement;

    public Datasource() {
        createTables();
    }


    public void open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            statement = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
        }
    }

    public void close() {
        try {
            if(statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }

    public boolean createTables(){
        open();//statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_STORAGES + " (" + COLUMN_STORAGE_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_STORAGE_NAME + " TEXT)");
        try {
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CLIENTS + " (" + COLUMN_CLIENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_INGREDIENTS + " (" + COLUMN_INGREDIENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_INGREDIENT_NAME + " TEXT, " + COLUMN_INGREDIENT_FORPIZZA + " TEXT," + COLUMN_INGREDIENT_FORPASTA + " TEXT," + COLUMN_INGREDIENT_FORDRINKS + " TEXT)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_INGREDIENTPURCHASES + " (" + COLUMN_INGREDIENTPURCHASE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_INGREDIENTPURCHASE_INGID + " INTEGER, " + COLUMN_INGREDIENTPURCHASE_DATE + " TEXT, " + COLUMN_INGREDIENTPURCHASE_AMOUNT + " REAL, " + COLUMN_INGREDIENTPURCHASE_PRICE + " REAL)");
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_MENUPOSITIONS + " (" + COLUMN_MENUPOSITION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_MENUPOSITION_NAME + " TEXT, " + COLUMN_MENUPOSITION_TYPE + " TEXT, " + COLUMN_MENUPOSITION_PRICESMALL + " REAL, " + COLUMN_MENUPOSITION_PRICEMEDIUM + " REAL, " + COLUMN_MENUPOSITION_PRICELARGE + " REAL)" );
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_ORDERS + " (" + COLUMN_ORDER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_ORDER_CLIENTID + " INTEGER, " + COLUMN_ORDER_DATE + " TEXT)");
        } catch (SQLException e) {
            System.out.println("Error during table creation" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        close();
        return true;
    }
    public static final String TABLE_CLIENTS ="clients";
    public static final String COLUMN_CLIENT_ID = "id";

    public static final String TABLE_INGREDIENTS ="ingredients";
    public static final String COLUMN_INGREDIENT_ID = "id";
    public static final String COLUMN_INGREDIENT_NAME = "name";
    public static final String COLUMN_INGREDIENT_FORPIZZA = "forPizza";
    public static final String COLUMN_INGREDIENT_FORPASTA = "forPasta";
    public static final String COLUMN_INGREDIENT_FORDRINKS = "forDrinks";

    public static final String TABLE_INGREDIENTPURCHASES = "ingredientPurchases";
    public static final String COLUMN_INGREDIENTPURCHASE_ID = "id";
    public static final String COLUMN_INGREDIENTPURCHASE_INGID = "ingId";
    public static final String COLUMN_INGREDIENTPURCHASE_DATE = "date";
    public static final String COLUMN_INGREDIENTPURCHASE_AMOUNT = "amount";
    public static final String COLUMN_INGREDIENTPURCHASE_PRICE = "price";

    public static final String TABLE_MENUPOSITIONS = "menuPositions";
    public static final String COLUMN_MENUPOSITION_ID = "id";
    public static final String COLUMN_MENUPOSITION_NAME = "name";
    public static final String COLUMN_MENUPOSITION_TYPE = "type";
    public static final String COLUMN_MENUPOSITION_PRICESMALL = "priceSmall";
    public static final String COLUMN_MENUPOSITION_PRICEMEDIUM = "priceMedium";
    public static final String COLUMN_MENUPOSITION_PRICELARGE = "priceLarge";

    public static final String TABLE_ORDERS = "orders";
    public static final String COLUMN_ORDER_ID = "id";
    public static final String COLUMN_ORDER_CLIENTID = "clientId";
    public static final String COLUMN_ORDER_DATE = "date";

    public static final String TABLE_ORDERLINES = "orderLines";
    public static final String COLUMN_ORDERLINE_ID = "id";
    public static final String COLUMN_ORDERLINE_ORDERID = "orderId";
    public static final String COLUMN_ORDERLINE_MENUPOSITIONID = "menuPositionId";
    public static final String COLUMN_ORDERLINE_SIZE = "size";
    public static final String COLUMN_ORDERLINE_AMOUNT = "amount";


//    public static final String TABLE_STORAGES = "storages";
//    public static final String COLUMN_STORAGE_ID = "_id";
//    public static final String COLUMN_STORAGE_NAME = "name";
//    public static final int INDEX_STORAGE_ID = 1;
//    public static final int INDEX_STORAGE_NAME = 2;
//
//    public static final String TABLE_REGISTERS = "registers";
//    public static final String COLUMN_REGISTER_ID = "_id";
//    public static final String COLUMN_REGISTER_NAME = "name";
//    public static final int INDEX_REGISTER_ID = 1;
//    public static final int INDEX_REGISTER_NAME = 2;
//
//    public static final String TABLE_BASKETS = "baskets";
//    public static final String COLUMN_BASKET_ID = "_id";
//    public static final String COLUMN_BASKET_NAME = "name";
//    public static final String COLUMN_BASKET_VALUE = "value";
//    public static final int INDEX_BASKET_ID = 1;
//    public static final int INDEX_BASKET_NAME = 2;
//    public static final int INDEX_BASKET_VALUE = 3;
//
//    public static final String TABLE_MENUS = "menus";
//    public static final String COLUMN_MENU_ID = "_id";
//    public static final String COLUMN_MENU_NAME = "name";
//    public static final int INDEX_MENU_ID = 1;
//    public static final int INDEX_MENU_NAME = 2;
//
//    public static final String TABLE_PIZZAS = "pizzas";
//    public static final String COLUMN_PIZZA_ID = "_id";
//    public static final String COLUMN_PIZZA_NAME = "name";
//    public static final String COLUMN_PIZZA_VALUE = "value";
//    public static final int INDEX_PIZZA_ID = 1;
//    public static final int INDEX_PIZZA_NAME = 2;
//    public static final int INDEX_PIZZA_VALUE = 3;
//
//    public static final String TABLE_INGREDIENTS = "ingredients";
//    public static final String COLUMN_INGREDIENT_ID = "_id";
//    public static final String COLUMN_INGREDIENT_NAME = "name";
//    public static final String COLUMN_INGREDIENT_PRICE = "price";
//    public static final String COLUMN_INGREDIENT_BOUGHT = "bought";
//    public static final String COLUMN_INGREDIENT_USED = "used";
//    public static final int INDEX_INGREDIENT_ID = 1;
//    public static final int INDEX_INGREDIENT_NAME = 2;
//    public static final int INDEX_INGREDIENT_PRICE = 3;
//    public static final int INDEX_INGREDIENT_BOUGHT = 4;
//    public static final int INDEX_INGREDIENT_USED = 5;
//
//    public static final String TABLE_DRINKS = "drinks";
//    public static final String COLUMN_DRINK_ID = "_id";
//    public static final String COLUMN_DRINK_NAME = "name";
//    public static final int INDEX_DRINK_ID = 1;
//    public static final int INDEX_DRINK_NAME = 2;
//
//    public static final String TABLE_PIZZATOPPINGS = "pizzaToppings";
//    public static final String COLUMN_PIZZATOPPING_ID = "_id";
//    public static final String COLUMN_PIZZATOPPING_NAME = "name";
//    public static final int INDEX_PIZZATOPPING_ID = 1;
//    public static final int INDEX_PIZZATOPPING_NAME = 2;


//    public void createTables(){
//
//        try {
//            open();
//            Statement statement = conn.createStatement();
//
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_STORAGES + " (" + COLUMN_STORAGE_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_STORAGE_NAME + " TEXT)");
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_REGISTERS + " (" + COLUMN_REGISTER_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_REGISTER_NAME + " TEXT)");
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_MENUS + " (" + COLUMN_MENU_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_MENU_NAME + " TEXT)");
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_DRINKS + " (" + COLUMN_DRINK_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_DRINK_NAME + " TEXT)");
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_PIZZATOPPINGS + " (" + COLUMN_PIZZATOPPING_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_PIZZATOPPING_NAME + " TEXT)");
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_INGREDIENTS + " (" + COLUMN_INGREDIENT_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_INGREDIENT_NAME + " TEXT," + COLUMN_INGREDIENT_PRICE + " REAL, " + COLUMN_INGREDIENT_BOUGHT + " REAL, " + COLUMN_INGREDIENT_USED + " REAL)");
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_BASKETS + " (" + COLUMN_BASKET_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_BASKET_NAME + " TEXT, " + COLUMN_BASKET_VALUE + " DOUBLE)");
//            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_PIZZAS + " (" + COLUMN_PIZZA_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_PIZZA_NAME + " TEXT, " + COLUMN_PIZZA_VALUE + " DOUBLE)");
//
//            statement.close();
//            close();
//        } catch (SQLException e) {
//            System.err.println("Connection problem " + e.getMessage());
//            e.printStackTrace();
//        }
//
//    }




}


















