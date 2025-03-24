package com.hanan.ejsabs.ej7;

public class Motorcycle extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Moto arrancando");
    }

    @Override
    public void stopEngine() {
        System.out.println("Parando la moto");
    }
}
