package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    double speed;
    private double acceleration;
    private double deceleration;

    public Opel(double speed, double acceleration, double deceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

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