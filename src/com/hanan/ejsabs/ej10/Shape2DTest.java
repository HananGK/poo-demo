package com.hanan.ejsabs.ej10;

public class Shape2DTest {
    public static void main(String[] args) {
        Circle circulo = new Circle(6, 8);
        Rectangle rectangulo = new Rectangle(8, 3, 14, 9);

        Shape2D[] shapes = {circulo, rectangulo};
        for (Shape2D shape : shapes) {
            shape.draw();
            shape.resize();
        }
    }
}
