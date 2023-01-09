package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;
import java.time.Month;

public class ClockSeason {

    private Month getSeason() {
        return LocalDate.now().getMonth();
    }

    private LocalDate getTime() {
        return LocalDate.now();
    }
}
