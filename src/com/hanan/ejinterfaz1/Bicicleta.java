package com.hanan.ejinterfaz1;

public class Bicicleta implements Frenable{
    private boolean frenos;
    private int velocidad;
    private int marcha;

    @Override
    public void frenar() {
        frenos = true;
        velocidad = 0;
        System.out.println("Frenando");
    }


    public void soltarFrenos() {
        frenos = false;
        velocidad = 10;
        System.out.println("Soltando frenos");
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void subirMarcha(int marcha) {
        this.marcha += 1;
    }

    public void bajarMarcha(int marcha) {
        this.marcha -= 1;
    }


}
