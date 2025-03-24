package com.hanan.ejsabs.ej2;

public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }




    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

}
