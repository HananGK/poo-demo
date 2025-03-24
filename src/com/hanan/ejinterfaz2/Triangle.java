package com.hanan.ejinterfaz2;

public class Triangle implements Shape {
    private double base;
    private double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void getArea() {
        double area = (base*altura)/2;
        System.out.println("El área del triángulo es: " + String.format("%.2f", area));
    }
}
