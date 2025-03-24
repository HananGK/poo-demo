package com.hanan.polimorfismo;

public class Tiger extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Tigre haciendo grrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Tigre comiendo un mono");
    }
}

