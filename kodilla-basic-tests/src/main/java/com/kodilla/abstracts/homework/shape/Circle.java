package com.kodilla.abstracts.homework.shape;

public class Circle extends Shape {
    private static double PI = 3.1415927;
    private double radius;
    public Circle(double radius) {
        super();
        this.radius = radius;
        System.out.println("A circle with a radius: " + this.radius);
    }
    @Override
    public double calculateArea() {
        double area;
        area = this.radius * PI;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = this.radius * 2 * PI;
        return perimeter;
    }
}