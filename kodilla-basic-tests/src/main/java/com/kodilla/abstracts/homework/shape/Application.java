package com.kodilla.abstracts.homework.shape;

public class Application {
    public static void main(String[] args) {
        Shape squareExample = new Square(4);
        System.out.println("Area of the square: " + squareExample.calculateArea());
        System.out.println("Perimeter of the square: " + squareExample.calculatePerimeter());

        Shape triangleExample = new Triangle(5, 3.5, 4.3, 3);
        System.out.println("Area of the triangle: " + triangleExample.calculateArea());
        System.out.println("Perimeter of the triangle : " + triangleExample.calculatePerimeter());

        Shape circleExample = new Circle(5);
        System.out.println("Area of the circle: " + circleExample.calculateArea());
        System.out.println("Perimeter of the circle: " + circleExample.calculatePerimeter());
    }
}