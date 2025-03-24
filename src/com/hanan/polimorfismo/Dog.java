package com.hanan.polimorfismo;

public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Guauuu");
    }

    @Override
    public void eat() {
        System.out.println("Perro comiendo pienso");
    }
}
