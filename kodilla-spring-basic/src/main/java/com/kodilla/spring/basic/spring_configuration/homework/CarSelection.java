package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarSelection {

    @Bean
    public static Car selectCar() {
        Random random = new Random();
        int month = random.nextInt((12) + 1);
        int hour = random.nextInt((24) + 1);
        Car car;

        if (month >= 6 && month <= 8) {
            car = new Cabrio(hour < 6 || hour >= 20);
        } else if (month == 12 || month <= 2) {
            car = new SUV(hour < 6 || hour >= 20);
        } else {
            car = new Sedan(hour < 6 || hour >= 20);
        }
        return car;
    }

    public static void main(String[] args) {
        System.out.println("Car type: " + selectCar().getCarType() + "; with lights on: " + selectCar().hasHeadlightsTurnedOn());
    }
}

