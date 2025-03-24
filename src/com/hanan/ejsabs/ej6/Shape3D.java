package com.hanan.ejsabs.ej6;

/*6. Escriba un programa Java para crear una clase abstracta Shape3D con los
métodos abstractos calculateVolume() y calculateSurfaceArea(). Cree las
subclases Sphere y Cube que extiendan la clase Shape3D e implementen los
métodos respectivos para calcular el volumen y el área de superficie de cada
forma.*/

public abstract class Shape3D {
    private String name;

    public Shape3D(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}
