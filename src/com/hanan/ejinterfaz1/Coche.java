package com.hanan.ejinterfaz1;

public class Coche implements Frenable{
    private boolean frenos;
    private int velocidad;

    @Override
    public void frenar() {
        frenos = true;
        velocidad = 0;
        System.out.println("Frenando");
    }

    @Override
    public void soltarFrenos() {
        frenos = false;
        velocidad = 10;
        System.out.println("Soltando frenos");
    }

    public int getVelocidad() {
        return velocidad;
    }
}
