package com.kodilla.inheritance.homework;

public class OSExtendedTwo extends OperatingSystem {

    public OSExtendedTwo(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Einschalten des Systems.");
    }

    @Override
    public void turnOff() {
        System.out.println("Ausschalten des Systems.");
    }
}