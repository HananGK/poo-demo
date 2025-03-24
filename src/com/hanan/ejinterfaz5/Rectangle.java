package com.hanan.ejinterfaz5;

public class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int resizeWidth(int newWidth) {
        return width = newWidth;
    }

    @Override
    public int resizeHeight(int newHeight) {
        return height = newHeight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
