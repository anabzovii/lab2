package com.company;

import java.time.LocalDate;

public class Bilet {
    private String codbilet;
    private String countryin;
    private String countryout;
    private float price;
    private LocalDate data;
    private int client;
    private int avion;

    public String getCodbilet() {
        return codbilet;
    }

    public void setCodbilet(String codbilet) {
        this.codbilet = codbilet;
    }

    public String getCountryin() {
        return countryin;
    }

    public void setCountryin(String countryin) {
        this.countryin = countryin;
    }

    public String getCountryout() {
        return countryout;
    }

    public void setCountryout(String countryout) {
        this.countryout = countryout;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public int getAvion() {
        return avion;
    }

    public void setAvion(int avion) {
        this.avion = avion;
    }

    public Bilet(String codbilet, String countryin, String countryout, float price, LocalDate data, int client, int avion) {
        this.codbilet = codbilet;
        this.countryin = countryin;
        this.countryout = countryout;
        this.price = price;
        this.data = data;
        this.client = client;
        this.avion = avion;
    }
}
