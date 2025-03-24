package com.hanan.ejvehiculos;

public class Automovil extends Vehiculo {
    private int numAsientos;
    private int numPuertas;

    public Automovil(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void mostarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Numero de asientos: " + numAsientos);
        System.out.println("Numero de puertas: " + numPuertas);
    }

    public void pruebaDelMotor() {
        System.out.println("Poniendo a prueba el motor");
    }
}
