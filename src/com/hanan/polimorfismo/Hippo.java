package com.hanan.polimorfismo;

public class Hippo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("XXXXXXXXXXXX");
    }

    @Override
    public void eat() {
        System.out.println("Hippo comiendo plantita acuatica");
    }
}

