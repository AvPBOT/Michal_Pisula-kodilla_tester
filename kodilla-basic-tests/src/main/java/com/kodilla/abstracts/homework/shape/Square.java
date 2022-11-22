package com.kodilla.abstracts.homework.shape;

public class Square extends Shape {
    private double side;
    public Square(double side) {
        super();
        this.side = side;
        System.out.println("A square with side lengths: " + this.side);
    }
    @Override
    public double calculateArea() {
        double area;
        area = this.side * this.side;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        double perimeter = this.side * 4;
        return perimeter;
    }
}