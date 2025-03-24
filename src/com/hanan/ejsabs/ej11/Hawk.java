package com.hanan.ejsabs.ej11;

public class Hawk extends Bird {
    @Override
    public void fly() {
        System.out.println("Hawk flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Hawk making sound");
    }
}
