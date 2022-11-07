package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("Car type: " + getCarName(car));
        System.out.println("Car name: " + car);
    }

    static String getCarName(Car car) {
        if (car instanceof Ford) {
            return "Ford";
        }
        if (car instanceof Opel) {
            return "Opel";
        }
        if (car instanceof BMW) {
            return "BMW";
        }
        return null;
    }
}