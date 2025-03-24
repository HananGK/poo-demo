package com.hanan.ejsabs.ej12;

public class Square extends GeometricShape {
    private double lado;

    public Square(double lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        double area = Math.pow(lado, 2);
        System.out.println("El area del cuadrado es " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = 4 * lado;
        System.out.println("El perimetro del cuadrado es " + perimetro);
    }
}
