package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private double currentSpeed;
    private static final double acceleration = 15;
    private static final double deceleration = 20;

    public Ford(double speed) {
        currentSpeed = speed;
    }

    public double getSpeed() {
        return currentSpeed;
    }

    public void increaseSpeed() {
        currentSpeed += acceleration;
    }

    public void decreaseSpeed() {
        if (currentSpeed > deceleration) {
            currentSpeed -= deceleration;
        } else {
            currentSpeed = 0;
        }
    }

    @Override
    public String toString() {
        return "Ford{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}