package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.kodilla.collections.arrays.homework.CarsApplication.drawCar;

public class CarsListApplication {

    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        int carsCount = random.nextInt((13)+3);
        for (int n = 0; n < carsCount; n++) {
            cars.add(drawCar());
        }

        System.out.println("Zawartość listy po dodaniu " + carsCount + " obiektów: ");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
        System.out.println("Rozmiar listy: " + cars.size());

        int randomIndex = random.nextInt(cars.size());
        cars.remove(randomIndex);
        System.out.println();
        System.out.println("Usunięto jeden z samochodów z kolekcji, używając do tego metody remove(int index).");

        Car randomCar = cars.get(random.nextInt(cars.size()));
        cars.remove(randomCar);
        System.out.println("Usunięto jeden z samochodów z kolekcji, używając do tego metody remove(Object o).");

        System.out.println();
        System.out.println("Zawartość listy po usunięciu dwóch obiektów: ");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
            System.out.println("Rozmiar listy: " + cars.size());

            if (cars.size() == (carsCount - 2)) {
                System.out.println("OK");
            } else {
                System.out.println("Something went wrong");
            }
    }
}