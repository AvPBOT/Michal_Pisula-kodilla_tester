package com.kodilla.abstracts.homework.shape;

public class Triangle extends Shape {
    private double base;
    private double armOne;
    private double armTwo;
    private double height;
    public Triangle(double base, double armOne, double armTwo, double height) {
        super();
        this.base = base;
        this.armOne = armOne;
        this.armTwo = armTwo;
        this.height = height;
        System.out.println("A triangle with side lengths: " + this.base + ", " + this.armOne + ", " + this.armTwo + " and height: " + this.height);
    }
    @Override
    public double calculateArea() {
        double area;
        area = this.base * this.height / 2;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = this.base + this.armOne + this.armTwo;
        return perimeter;
    }
}