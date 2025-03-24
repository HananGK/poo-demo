package com.hanan.ejsabs.ej4;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("El tigre se come un mono");
    }

    @Override
    public void sleep() {
        System.out.println("El tigre duerme en la selva");
    }
}
