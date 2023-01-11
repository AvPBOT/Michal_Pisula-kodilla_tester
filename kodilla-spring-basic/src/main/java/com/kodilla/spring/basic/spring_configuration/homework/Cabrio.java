package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {
    private final boolean headLights;

    public Cabrio(boolean headLights) {
        this.headLights = headLights;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headLights;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}