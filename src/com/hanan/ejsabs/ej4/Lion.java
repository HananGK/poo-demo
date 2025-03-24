package com.hanan.ejsabs.ej4;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("El león se come una gacela");
    }

    @Override
    public void sleep() {
        System.out.println("El león duerme en la sabana");
    }
}
