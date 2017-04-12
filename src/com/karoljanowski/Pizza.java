package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public class Pizza extends AdditionsPizza{
    private int index;
    private String name;
    private double priceSmallPizza;
    private double priceBigPizza;
    private double priceGrandePizza;

    public Pizza(int index, String name, double priceSmall, double priceMedium, double priceLarge, boolean sos, boolean ser, boolean parmezan, boolean bialaMozzarella, boolean gorgonzola, boolean tabasco, boolean pomidorkiKoktajlowe, boolean pepperoni, boolean bazylia, boolean pomidorySuszone, boolean rukola, boolean natkaPieyruszki, boolean awokado, boolean paprykaSlodka, boolean ananas, boolean brokuly, boolean kukurydza, boolean szpinak, boolean pomidor, boolean papryka, boolean oliwkiCzarne, boolean cebula, boolean pieczarki, boolean lososWedzony, boolean szynkaParmenska, boolean owoceMorza, boolean jajko, boolean kielbasa, boolean salami, boolean szynka, boolean bekon, boolean kurczak) {
        super(index, name, priceSmall, priceMedium, priceLarge, sos, ser, parmezan, bialaMozzarella, gorgonzola, tabasco, pomidorkiKoktajlowe, pepperoni, bazylia, pomidorySuszone, rukola, natkaPieyruszki, awokado, paprykaSlodka, ananas, brokuly, kukurydza, szpinak, pomidor, papryka, oliwkiCzarne, cebula, pieczarki, lososWedzony, szynkaParmenska, owoceMorza, jajko, kielbasa, salami, szynka, bekon, kurczak);
    this.index = index;
    this.name = name;
    this.priceSmallPizza = priceSmall;
    this.priceBigPizza = priceMedium;
    this.priceGrandePizza = priceLarge;
    }

    public String getName() {
        return name;
    }

    public double getPriceSmallPizza() {
        return priceSmallPizza;
    }

    public double getPriceBigPizza() {
        return priceBigPizza;
    }

    public double getPriceGrandePizza() {
        return priceGrandePizza;
    }
}
