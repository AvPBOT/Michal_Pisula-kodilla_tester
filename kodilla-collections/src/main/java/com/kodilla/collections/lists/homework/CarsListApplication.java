package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Ford ford = new Ford(150, 15, 20);
        cars.add(ford);
        cars.add(new Ford(155, 20, 25));
        cars.add(new Ford(160, 25, 30));
        cars.add(new Opel(130, 20, 15));
        cars.add(new Opel(135, 25, 20));
        cars.add(new Opel(140, 30, 25));
        cars.add(new Volkswagen(140, 25, 10));
        cars.add(new Volkswagen(145, 30, 15));
        cars.add(new Volkswagen(150, 35, 20));

        System.out.println("Zawartość kolekcji");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
        System.out.println("Rozmiar kolekcji: " + cars.size());

        cars.remove(4);

        cars.remove(ford);

        System.out.println();
        System.out.println("Zawartość kolekcji po usunięciu obiektu z indeksem 4 oraz usunięciu obiektu ford: ");
        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println();
        System.out.println("Rozmiar kolekcji: " + cars.size());
    }
}