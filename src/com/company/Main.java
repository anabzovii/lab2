package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        Aeroport aeroport = new Aeroport("Aeroport Moldova", "Dacia 77/1", "1");
        System.out.println(aeroport.getName()+" "+aeroport.getAddress());

        System.out.println("----------------------------------------------------");
        Operator operator1 = new Operator("Ion", "Cutelaba","20024002671", 1998, LocalDate.parse("2021-12-11"),12000, "1");
        System.out.println("Salariu initial este de "+ operator1.getSalary() + " lei");
        System.out.println("Noul salariu este de : "+ operator1.majorare10(1.7)+ " lei.");

        System.out.println("----------------------------------------------------");
        



    }
}
