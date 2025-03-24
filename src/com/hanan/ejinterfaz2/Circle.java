package com.hanan.ejinterfaz2;

public class Circle implements Shape {
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public void getArea() {
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + String.format("%.2f", area));
    }
}
