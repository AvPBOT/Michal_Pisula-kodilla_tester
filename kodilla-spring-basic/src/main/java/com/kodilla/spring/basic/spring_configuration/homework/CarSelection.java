package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class CarSelection {
    Car car;

    public Car selectCar(ClockSeason clockSeason) {

        if (clockSeason.getSeason() == Season.SUMMER) {
            car = new Cabrio(clockSeason.getTime().isBefore(LocalTime.of(6, 0)) || clockSeason.getTime().isAfter(LocalTime.of(19, 59)));
        } else if (clockSeason.getSeason() == Season.WINTER) {
            car = new SUV(clockSeason.getTime().isBefore(LocalTime.of(6, 0)) || clockSeason.getTime().isAfter(LocalTime.of(19, 59)));
        } else if (clockSeason.getSeason() == Season.SPRING || clockSeason.getSeason() == Season.AUTUMN) {
            car = new Sedan(clockSeason.getTime().isBefore(LocalTime.of(6, 0)) || clockSeason.getTime().isAfter(LocalTime.of(19, 59)));
        }
        return car;
    }
}

