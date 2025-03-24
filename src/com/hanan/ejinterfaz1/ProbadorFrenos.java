package com.hanan.ejinterfaz1;

public class ProbadorFrenos {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();

        Frenable[] frenables = new Frenable[2];
        frenables[0] = coche;
        frenables[1] = bicicleta;

        for (Frenable frenable : frenables) {
            frenable.frenar();
            frenable.soltarFrenos();
        }
    }
}
