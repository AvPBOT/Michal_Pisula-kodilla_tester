package com.kodilla;

public class Loops {
    public static void main(String[] args) {
        /*
        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfElements = names.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

        // inkrementacja

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // dekrementacja

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
         */

            int[] numbers = new int[] {96, 70, 87, 34, 91}; // https://www.random.org/

        int first = numbers[0];
       // System.out.println(first);
        int second = numbers[1];
       // System.out.println(second);
        int third = numbers[2];
       // System.out.println(third);
        int fourth = numbers[3];
       // System.out.println(fourth);
        int fifth = numbers[4];
       // System.out.println(fifth);

        System.out.println("Tablica składa się z następujących elementów: ");

        int numberOfElements = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int sumNumbers = first + second + third + fourth + fifth;

        System.out.println("Suma wszystkich elementów to " + sumNumbers);

    }
}

