package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private double speed = 130;
    private double acceleration = 20;
    private double deceleration = 15;

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
        return "Opel{" +
                "speed=" + speed +
                ", acceleration=" + acceleration +
                ", deceleration=" + deceleration +
                '}';
    }
}



