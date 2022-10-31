package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private double speed = 150;
    private double acceleration = 15;
    private double deceleration = 20;

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
        return "Ford{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", deceleration=" + deceleration +
                '}';
    }
}

