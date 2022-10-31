package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(150,15,20);
        doRace(ford);

        Opel opel = new Opel(130,20,15);
        doRace(opel);

        Volkswagen volkswagen = new Volkswagen(140,25,10);
        doRace(volkswagen);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }
}