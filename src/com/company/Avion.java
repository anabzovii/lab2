package com.company;

public class Avion {
    private String model;
    private String countryprod;
    private int anproducere;
    private int nrpasageri;
    private float fueltank;
    private int company;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountryprod() {
        return countryprod;
    }

    public void setCountryprod(String countryprod) {
        this.countryprod = countryprod;
    }

    public int getAnproducere() {
        return anproducere;
    }

    public void setAnproducere(int anproducere) {
        this.anproducere = anproducere;
    }

    public int getNrpasageri() {
        return nrpasageri;
    }

    public void setNrpasageri(int nrpasageri) {
        this.nrpasageri = nrpasageri;
    }

    public float getFueltank() {
        return fueltank;
    }

    public void setFueltank(float fueltank) {
        this.fueltank = fueltank;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public Avion(String model, String countryprod, int anproducere, int nrpasageri, float fueltank, int company) {
        this.model = model;
        this.countryprod = countryprod;
        this.anproducere = anproducere;
        this.nrpasageri = nrpasageri;
        this.fueltank = fueltank;
        this.company = company;
    }
}
