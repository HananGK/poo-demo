package com.hanan.ejsabs.ej10;

public class Rectangle extends Shape2D{
    private double base;
    private double altura;
    private double newBase;
    private double newAltura;


    public Rectangle(double base, double altura,  double newBase, double newAltura) {
        this.base = base;
        this.altura = altura;
        this.newBase = newBase;
        this.newAltura = newAltura;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un rectangulo con base " +  base + " y altura " + altura);
    }

    @Override
    public void resize() {
        System.out.println("El rectangulo con base " + base + " y altura " + altura + " se va a dibujar con una nueva base  " +  newBase + " y nueva altura " + newAltura);
    }
}
