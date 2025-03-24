package com.hanan.ejsabs.ej12;

public class GeometricShapeTest {
    public static void main(String[] args) {
        Triangle triangulo = new Triangle(5, 7, 6, 4);
        Square square = new Square(5);

        GeometricShape[]  geometricShapes = {triangulo, square};
        for (GeometricShape geometricShape : geometricShapes) {
            geometricShape.area();
            geometricShape.perimetro();
        }
    }
}
