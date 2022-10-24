package com.kodilla.inheritance.homework;
public class Application {
    public static void main(String[] args) {
        OperatingSystem windows95 = new OperatingSystem(1995);
        windows95.getReleaseYear();
    //  windows95.printReleaseYear();
        windows95.turnOn();
        windows95.turnOff();

        OSExtendedOne windows98 = new OSExtendedOne(1998);
        windows98.getReleaseYear();
    //  windows98.printReleaseYear();
        windows98.turnOn();
        windows98.turnOff();

        OSExtendedTwo windows2000 = new OSExtendedTwo(2000);
        windows2000.getReleaseYear();
    //  windows2000.printReleaseYear();
        windows2000.turnOn();
        windows2000.turnOff();
    }
}