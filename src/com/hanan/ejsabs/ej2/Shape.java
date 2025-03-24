package com.hanan.ejsabs.ej2;
/*2. Escribe un programa Java para crear una clase abstracta Shape con los
métodos abstractos calculateArea() y calculatePerimeter(). Crea las subclases
Circle y Triangle que extiendan la clase Shape e implementa los métodos
respectivos para calcular el área y el perímetro de cada forma.*/

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getName(){
        return name;
    }
}
