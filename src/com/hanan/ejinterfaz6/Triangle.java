package com.hanan.ejinterfaz6;

public class Triangle implements  Drawable{
    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle with height "+height + " and width "+width);
    }
}
