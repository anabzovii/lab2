package com.company;

public class Client {
    private String name;
    private String surname;
    private String code;
    private int nrzboruri;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNrzboruri() {
        return nrzboruri;
    }

    public void setNrzboruri(int nrzboruri) {
        this.nrzboruri = nrzboruri;
    }

    public int getAeroport() {
        return aeroport;
    }

    public void setAeroport(int aeroport) {
        this.aeroport = aeroport;
    }

    public Client(String name, String surname, String code, int nrzboruri, int aeroport) {
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.nrzboruri = nrzboruri;
        this.aeroport = aeroport;
    }
}
