package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {

    private double speed = 140;
    private double acceleration = 25;
    private double deceleration = 10;

    public double getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        speed += acceleration;
    }

    public void decreaseSpeed() {
        speed -= deceleration;
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", deceleration=" + deceleration +
                '}';
    }
}