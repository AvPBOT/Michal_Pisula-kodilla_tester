package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private double currentSpeed;
    private static final double acceleration = 20;
    private static final double deceleration = 15;

    public Opel(double speed) {
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
        return "Opel{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}