package com.hanan.polimorfismo;

public class Wolf extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Auuuuuuu");
    }

    @Override
    public void eat() {
        System.out.println("Lobo comiendo una ovejita");
    }
}

