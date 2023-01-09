package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarSelection {
    static ClockSeason clockSeason = new ClockSeason();
    static Car car;

    @Bean
    public static Car selectCar() {

        if (ClockSeason.getSeason() == Season.SUMMER) {
            car = new Cabrio(ClockSeason.getTime().isBefore(LocalTime.of(6, 0)) || ClockSeason.getTime().isAfter(LocalTime.of(19,59)));
        } else if (ClockSeason.getSeason() == Season.WINTER) {
            car = new SUV(ClockSeason.getTime().isBefore(LocalTime.of(6, 0)) || ClockSeason.getTime().isAfter(LocalTime.of(19,59)));
        } else if (ClockSeason.getSeason() == Season.SPRING || ClockSeason.getSeason() == Season.AUTUMN){
            car = new Sedan(ClockSeason.getTime().isBefore(LocalTime.of(6, 0)) || ClockSeason.getTime().isAfter(LocalTime.of(19,59)));
        }
        return car;
    }

    public static void main(String[] args) {
        selectCar();
        System.out.println("The season is: " + ClockSeason.getSeason() + "; the time is: " + ClockSeason.getTime() + ".");
        System.out.println("Desired car type is: " + car.getCarType() + "; with lights turned on: " + car.hasHeadlightsTurnedOn() + ".");
    }
}

