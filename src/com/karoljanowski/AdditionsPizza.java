package com.karoljanowski;

/**
 * Created by Karol Janowski on 2017-04-08.
 */
public abstract class AdditionsPizza extends MenuPosition {
    private boolean sos;
    private boolean ser;
    private boolean parmezan;
    private boolean bialaMozzarella;
    private boolean gorgonzola;
    private boolean tabasco;
    private boolean pomidorkiKoktajlowe;
    private boolean pepperoni;
    private boolean bazylia;
    private boolean pomidorySuszone;
    private boolean rukola;
    private boolean natkaPieyruszki;
    private boolean awokado;
    private boolean paprykaSlodka;
    private boolean ananas;
    private boolean brokuly;
    private boolean kukurydza;
    private boolean szpinak;
    private boolean pomidor;
    private boolean papryka;
    private boolean oliwkiCzarne;
    private boolean cebula;
    private boolean pieczarki;
    private boolean lososWedzony;
    private boolean szynkaParmenska;
    private boolean owoceMorza;
    private boolean jajko;
    private boolean kielbasa;
    private boolean salami;
    private boolean szynka;
    private boolean bekon;
    private boolean kurczak;

    public AdditionsPizza(int index, String name, double priceSmall, double priceMedium, double priceLarge, boolean sos, boolean ser, boolean parmezan, boolean bialaMozzarella, boolean gorgonzola, boolean tabasco, boolean pomidorkiKoktajlowe, boolean pepperoni, boolean bazylia, boolean pomidorySuszone, boolean rukola, boolean natkaPieyruszki, boolean awokado, boolean paprykaSlodka, boolean ananas, boolean brokuly, boolean kukurydza, boolean szpinak, boolean pomidor, boolean papryka, boolean oliwkiCzarne, boolean cebula, boolean pieczarki, boolean lososWedzony, boolean szynkaParmenska, boolean owoceMorza, boolean jajko, boolean kielbasa, boolean salami, boolean szynka, boolean bekon, boolean kurczak) {
        super(index, name, priceSmall, priceMedium, priceLarge);
        this.sos = sos;
        this.ser = ser;
        this.parmezan = parmezan;
        this.bialaMozzarella = bialaMozzarella;
        this.gorgonzola = gorgonzola;
        this.tabasco = tabasco;
        this.pomidorkiKoktajlowe = pomidorkiKoktajlowe;
        this.pepperoni = pepperoni;
        this.bazylia = bazylia;
        this.pomidorySuszone = pomidorySuszone;
        this.rukola = rukola;
        this.natkaPieyruszki = natkaPieyruszki;
        this.awokado = awokado;
        this.paprykaSlodka = paprykaSlodka;
        this.ananas = ananas;
        this.brokuly = brokuly;
        this.kukurydza = kukurydza;
        this.szpinak = szpinak;
        this.pomidor = pomidor;
        this.papryka = papryka;
        this.oliwkiCzarne = oliwkiCzarne;
        this.cebula = cebula;
        this.pieczarki = pieczarki;
        this.lososWedzony = lososWedzony;
        this.szynkaParmenska = szynkaParmenska;
        this.owoceMorza = owoceMorza;
        this.jajko = jajko;
        this.kielbasa = kielbasa;
        this.salami = salami;
        this.szynka = szynka;
        this.bekon = bekon;
        this.kurczak = kurczak;
    }
}
