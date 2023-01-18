package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {
    private final boolean headLights;

    public SUV(boolean headLights) {
        this.headLights = headLights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headLights;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}