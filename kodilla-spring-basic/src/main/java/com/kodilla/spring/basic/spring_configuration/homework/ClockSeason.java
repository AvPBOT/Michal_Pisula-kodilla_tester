package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClockSeason {
    private Season season;

    public Season getSeason() {
        switch (LocalDate.now().getMonthValue()) {
            case 12:
            case 1:
            case 2:
                return Season.WINTER;
            case 3:
            case 4:
            case 5:
                return Season.SPRING;
            case 6:
            case 7:
            case 8:
                return Season.SUMMER;
            case 9:
            case 10:
            case 11:
                return Season.AUTUMN;
        }
        return season;
    }

    @Bean
    public LocalTime getTime() {
        return LocalTime.now();
    }
}
