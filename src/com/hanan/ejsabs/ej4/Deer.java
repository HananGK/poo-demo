package com.hanan.ejsabs.ej4;

public class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("El ciervo se come unas bayas");
    }

    @Override
    public void sleep() {
        System.out.println("El ciervo duerme en el bosque");
    }
}
