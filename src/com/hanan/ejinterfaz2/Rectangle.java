package com.hanan.ejinterfaz2;

public class Rectangle implements Shape {
    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void getArea() {
        double area = base*altura;
        System.out.println("El área del rectángulo es: " + String.format("%.2f", area));
    }
}
