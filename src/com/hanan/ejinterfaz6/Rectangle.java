package com.hanan.ejinterfaz6;

public class Rectangle implements  Drawable{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with height "+height + " and width "+width);
    }
}
