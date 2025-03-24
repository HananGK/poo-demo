package com.hanan.ejinterfaz6;

public class DrawableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(7, 5);
        Triangle triangle = new Triangle(8, 3);

        Drawable[] drawables = {circle,rectangle,triangle};
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
