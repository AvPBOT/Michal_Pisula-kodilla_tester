package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Car[] cars = new Car[RANDOM.nextInt(15+1 - 1) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        int drawnCarKind = RANDOM.nextInt(3);
        double a = getRandomValue();

        if (drawnCarKind == 0) {
            return new Ford(a);
        }
        else if (drawnCarKind == 1) {
            return new Opel(a);
        }
        else {
            return new BMW(a);
        }
    }

    private static double getRandomValue() {
        return RANDOM.nextDouble() * 100 + 1;
    }
}