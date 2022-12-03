package com.company;

import java.time.LocalDate;

public class Operator {
    private String name;
    private String surname;
    private String code;
    private int year;
    private LocalDate angajare;
    private double salary;
    private String aeroport;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getAngajare() {
        return angajare;
    }

    public void setAngajare(LocalDate angajare) {
        this.angajare = angajare;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAeroport() {
        return aeroport;
    }

    public void setAeroport(String aeroport) {
        this.aeroport = aeroport;
    }

    public Operator(String name, String surname, String code, int year, LocalDate angajare, double salary, String aeroport) {
        this.name = name;
        this.surname = surname;
        this.code = code;
        this.year = year;
        this.angajare = angajare;
        this.salary = salary;
        this.aeroport = aeroport;
    }

    public double majorare10(double coef){
        double newsalary= salary *coef ;
        return newsalary;
    }
}
