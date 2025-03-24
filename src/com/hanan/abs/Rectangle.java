package com.hanan.abs;

public class Rectangle extends Forma{
    private double base;
    private double altura;

    public Rectangle(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
