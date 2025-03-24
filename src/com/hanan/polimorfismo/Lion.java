package com.hanan.polimorfismo;

public class Lion extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Leon comiendo una gacela");
    }
}

