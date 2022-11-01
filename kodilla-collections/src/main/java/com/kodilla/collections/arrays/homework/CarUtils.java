package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("Car type: " + getCarName(car));
        System.out.println("Car name: " + car.toString());
    }

    static String getCarName(Car car) {
        if(car instanceof Ford)
            return "Ford";

        else if(car instanceof Opel)
            return "Opel";

        else if(car instanceof Volkswagen)
            return "Volkswagen";

        else
            return "Unknown car name.";
    }
}