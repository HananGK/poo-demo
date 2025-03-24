package com.hanan.ejinterfaz5;


public class ResizableTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 6);

        System.out.println(rectangle);

        rectangle.resizeHeight(8);
        rectangle.resizeWidth(14);

        System.out.println(rectangle);

    }
}
