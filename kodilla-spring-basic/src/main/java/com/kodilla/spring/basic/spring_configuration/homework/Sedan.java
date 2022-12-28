package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    private boolean headLights;

    public Sedan(boolean headLights) {
        this.headLights = headLights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headLights;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}