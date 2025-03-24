package com.hanan.ejinterfaz2;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangulo = new Rectangle(4, 8);
        Triangle triangulo = new Triangle(6, 14);
        Circle circulo = new Circle(7);

        Shape[] shapes = new Shape[3];
        shapes[0] = rectangulo;
        shapes[1] = triangulo;
        shapes[2] = circulo;

        for (Shape shape : shapes) {
            shape.getArea();
        }
    }
}
