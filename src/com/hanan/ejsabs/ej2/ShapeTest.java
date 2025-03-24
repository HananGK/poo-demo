package com.hanan.ejsabs.ej2;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("circulo", 24);
        Triangle triangle = new Triangle("triangulo", 14, 7, 8, 10);

        Shape[] shapes = {circle, triangle};
        for (Shape shape : shapes){
            System.out.println("El área del " + shape.getName() + " es " + shape.calculateArea());
            System.out.println("El perímetro del " + shape.getName() + " es " + shape.calculatePerimeter());
        }
    }
}
