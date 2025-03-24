package com.hanan.ejsabs.ej6;

public class Cube extends Shape3D{
    private double lado;

    public Cube(String name, double lado) {
        super(name);
        this.lado = lado;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calculateSurfaceArea() {
        return  6 * Math.pow(lado, 2);
    }
}
