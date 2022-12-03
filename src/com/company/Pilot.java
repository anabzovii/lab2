package com.company;

public class Pilot {
    private String name;
    private String surname;
    private int stagiuani;
    private float salary;
    private int company;

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

    public int getStagiuani() {
        return stagiuani;
    }

    public void setStagiuani(int stagiuani) {
        this.stagiuani = stagiuani;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public Pilot(String name, String surname, int stagiuani, float salary, int company) {
        this.name = name;
        this.surname = surname;
        this.stagiuani = stagiuani;
        this.salary = salary;
        this.company = company;
    }
}
