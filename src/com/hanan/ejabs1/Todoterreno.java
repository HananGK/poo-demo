package com.hanan.ejabs1;

public class Todoterreno extends Coche{
    public Todoterreno(String model, String color, int maxSpeed) {
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
