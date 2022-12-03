package com.company;

import java.time.LocalDate;

public class Security {
    private String name;
    private String surname;
    private int heightcm;
    private LocalDate angajare;
    private float salariu;
    private int aeroport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHeightcm() {
        return heightcm;
    }

    public void setHeightcm(int heightcm) {
        this.heightcm = heightcm;
    }

    public LocalDate getAngajare() {
        return angajare;
    }

    public void setAngajare(LocalDate angajare) {
        this.angajare = angajare;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public int getAeroport() {
        return aeroport;
    }

    public void setAeroport(int aeroport) {
        this.aeroport = aeroport;
    }

    public Security(String name, String surname, int heightcm, LocalDate angajare, float salariu, int aeroport) {
        this.name = name;
        this.surname = surname;
        this.heightcm = heightcm;
        this.angajare = angajare;
        this.salariu = salariu;
        this.aeroport = aeroport;
    }
}
