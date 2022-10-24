package com.kodilla.inheritance.homework;
public class OperatingSystem {
    private int releaseYear;
    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void turnOn() {
        System.out.println("Włączanie systemu.");
    }
    public void turnOff() {
        System.out.println("Wyłączanie systemu.");
    }
    public int getReleaseYear() {
        return this.releaseYear;
    }
    /*
    public void printReleaseYear() {
        System.out.println("Rok wydania systemu to: " + this.releaseYear);
    }
    */
}