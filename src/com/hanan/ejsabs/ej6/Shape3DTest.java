package com.hanan.ejsabs.ej6;

public class Shape3DTest {
    public static void main(String[] args) {
        Sphere sphere = new Sphere("esfera", 13);
        Cube cube = new Cube("cubo", 7);

        Shape3D[] shape3Ds = {sphere,cube};
        for (Shape3D shape3D : shape3Ds) {
            System.out.println("El volumen de " + shape3D.getName() + " es " +  shape3D.calculateVolume());
            System.out.println("El área superficial de " + shape3D.getName() + " es " + shape3D.calculateSurfaceArea());
        }
    }
}
