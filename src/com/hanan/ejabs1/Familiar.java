package com.hanan.ejabs1;

public class Familiar extends Coche{
    public Familiar(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void acelerar() {
        System.out.println(getModel() + " "+ getColor()+ " acelerando");
    }

    @Override
    public void frenar() {
        System.out.println(getModel() + " "+ getColor()+ " acelerando");
    }
}
