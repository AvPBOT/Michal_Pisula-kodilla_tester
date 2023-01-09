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

        if (clockSeason.getSeason() == Season.SUMMER) {
            car = new Cabrio(clockSeason.getTime().isBefore(LocalTime.of(6, 0)) || clockSeason.getTime().isAfter(LocalTime.of(19,59)));
        } else if (clockSeason.getSeason() == Season.WINTER) {
            car = new SUV(clockSeason.getTime().isBefore(LocalTime.of(6, 0)) || clockSeason.getTime().isAfter(LocalTime.of(19,59)));
        } else if (clockSeason.getSeason() == Season.SPRING || clockSeason.getSeason() == Season.AUTUMN){
            car = new Sedan(clockSeason.getTime().isBefore(LocalTime.of(6, 0)) || clockSeason.getTime().isAfter(LocalTime.of(19,59)));
        }
        return car;
    }

    public static void main(String[] args) {
        selectCar();
        System.out.println("The season is: " + clockSeason.getSeason() + "; the time is: " + clockSeason.getTime() + ".");
        System.out.println("Desired car type is: " + car.getCarType() + "; with lights turned on: " + car.hasHeadlightsTurnedOn() + ".");
    }
}

