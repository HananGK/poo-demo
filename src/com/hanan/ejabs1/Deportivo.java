package com.hanan.ejabs1;

public class Deportivo extends Coche{
    public Deportivo(String model, String color, int maxSpeed) {
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
