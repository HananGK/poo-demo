package com.hanan.ejsabs.ej10;

public class Circle extends Shape2D{
    private double radius;
    private double newRadius;

    public Circle(double radius, double newRadius) {
        this.radius = radius;
        this.newRadius = newRadius;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un circulo con radio " +  radius);
    }

    @Override
    public void resize() {
        System.out.println("El circulo con radio " +  radius + " se va a dibujar con un nuevo radio de " +  newRadius);
    }
}
