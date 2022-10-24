package com.kodilla.abstracts.homework.job;

public class Application {
    public static void main(String[] args) {
        Doctor robert = new Person("Robert", 45, "Doctor");
        ((Person) robert).printResponsibilities();
    }
}