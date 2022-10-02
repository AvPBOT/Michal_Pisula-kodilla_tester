package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5]; // https://skalkuluj.pl/generator-imion
        names[0] = "Ota";
        names[1] = "Heliodor";
        names[2] = "Błażej";
        names[3] = "Miranda";
        names[4] = "Dalgur";

        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}