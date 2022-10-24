package com.kodilla.inheritance.homework;
public class OSExtendedOne extends OperatingSystem {
    public OSExtendedOne(int releaseYear) {
        super(releaseYear);
    }
    @Override
    public void turnOn() {
        System.out.println("Turning the system on.");
    }
    @Override
    public void turnOff() {
        System.out.println("Turning the system off.");
    }
}