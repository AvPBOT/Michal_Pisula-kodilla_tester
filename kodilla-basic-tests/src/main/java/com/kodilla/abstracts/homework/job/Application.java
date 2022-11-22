package com.kodilla.abstracts.homework.job;

public class Application {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Person robert = new Person("Robert", 45, doctor);
        robert.showResponsibilities();

        TaxiDriver taxiDriver = new TaxiDriver();
        Person artur = new Person("Artur", 33, taxiDriver);
        artur.showResponsibilities();
    }
}