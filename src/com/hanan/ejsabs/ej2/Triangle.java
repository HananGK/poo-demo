package com.hanan.ejsabs.ej2;

public class Triangle extends Shape{
    private double base;
    private double height;
    private double lado2;
    private double lado3;

    public Triangle(String name, double base, double height, double lado2, double lado3) {
        super(name);
        this.base = base;
        this.height = height;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return base + lado2 + lado3;
    }
}
