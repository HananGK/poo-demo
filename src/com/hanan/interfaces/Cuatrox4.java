package com.hanan.interfaces;

public class Cuatrox4 implements Manejable {

    private int velocidad;

    @Override
    public void detener() {
    System.out.println(("Deteniendo..."));
    velocidad = 0;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando...");
        velocidad = 10;

    }

    @Override
    public int acelerar(int aceleracion) {
        velocidad += aceleracion;
        System.out.println("Acelerando... Velocidad = " + velocidad);
        return velocidad;
    }

    @Override
    public void doblar(int angulo) {
        System.out.println("Vehículo doblando");

    }

    public int getVelocidad() {
        return velocidad;
    }
}
