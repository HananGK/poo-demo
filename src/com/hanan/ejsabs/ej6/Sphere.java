package com.hanan.ejsabs.ej6;

public class Sphere extends Shape3D{
    private double radius;

    public Sphere(String name,  double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (double) 4 /3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return  4 * Math.PI * Math.pow(radius, 2);
    }
}
