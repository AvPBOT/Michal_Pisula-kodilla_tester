package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.arrays.homework.CarsApplication;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car randomCar1 = new CarsApplication().drawCar();
        cars.add(randomCar1);
        Car randomCar2 = new CarsApplication().drawCar();
        cars.add(randomCar2);
        Car randomCar3 = new CarsApplication().drawCar();
        cars.add(randomCar3);
        Car randomCar4 = new CarsApplication().drawCar();
        cars.add(randomCar4);
        Car randomCar5 = new CarsApplication().drawCar();
        cars.add(randomCar5);
        Car randomCar6 = new CarsApplication().drawCar();
        cars.add(randomCar6);
        Car randomCar7 = new CarsApplication().drawCar();
        cars.add(randomCar7);
        Car randomCar8 = new CarsApplication().drawCar();
        cars.add(randomCar8);
        Car randomCar9 = new CarsApplication().drawCar();
        cars.add(randomCar9);

        int randomIndex = (int) (Math.random() * cars.size());

        System.out.println("Zawartość listy: ");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
        System.out.println("Rozmiar listy: " + cars.size());

        cars.remove(randomIndex);
        System.out.println();
        System.out.println("------");
        System.out.println();
        System.out.println("Zawartość listy po usunięciu pozycji o losowym indeksie przy pomocy remove(int index): ");
        System.out.println();
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
        System.out.println("Rozmiar listy: " + cars.size());

        cars.remove(randomCar6);
        System.out.println();
        System.out.println("------");
        System.out.println();
        System.out.println("Zawartość listy po usunięciu obiektu randomCar przy pomocy remove(Object o): ");
        System.out.println();
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
            System.out.println("Rozmiar listy: " + cars.size());
    }
}