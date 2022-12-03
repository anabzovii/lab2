package com.company;

public class Promotie {
    private String denumire;
    private int bilet;
    private float sumareducere;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getBilet() {
        return bilet;
    }

    public void setBilet(int bilet) {
        this.bilet = bilet;
    }

    public float getSumareducere() {
        return sumareducere;
    }

    public void setSumareducere(float sumareducere) {
        this.sumareducere = sumareducere;
    }

    public Promotie(String denumire, int bilet, float sumareducere) {
        this.denumire = denumire;
        this.bilet = bilet;
        this.sumareducere = sumareducere;
    }
}
