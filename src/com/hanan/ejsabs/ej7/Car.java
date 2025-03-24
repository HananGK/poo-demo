package com.hanan.ejsabs.ej7;

public class Car extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Coche arrancando");
    }

    @Override
    public void stopEngine() {
        System.out.println("Parando el coche");
    }
}
