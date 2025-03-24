package com.hanan.ejsabs.ej12;

public class Triangle extends GeometricShape {
    private double base;
    private double altura;
    private double lado2;
    private double lado3;

    public Triangle(double base, double altura,  double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void area() {
        double area = (base*altura)/2;
        System.out.println("El area del triangulo es " + area);
    }

    @Override
    public void perimetro() {
        double perimetro = base + lado2 + lado3;
        System.out.println("El perimetro del triangulo es " + perimetro);
    }
}
