package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {

    private double currentSpeed;
    private static final double acceleration = 25;
    private static final double deceleration = 10;

    public BMW(double speed) {
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
        return "BMW {" +
                "currentSpeed = " + currentSpeed +
                '}';
    }
}