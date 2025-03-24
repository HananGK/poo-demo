package com.hanan.interfaces;

public interface Manejable {
    void detener();

    void arrancar();

    int acelerar(int aceleracion);

    void doblar(int angulo);

    int getVelocidad();
}
