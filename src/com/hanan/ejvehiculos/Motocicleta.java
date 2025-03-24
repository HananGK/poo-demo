package com.hanan.ejvehiculos;

public class Motocicleta extends Vehiculo {
    private int numAsientos;

    public Motocicleta(int precioDia, String marcaModelo, int numLlantas, int numAsientos) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Numero de asientos: " + numAsientos);
    }

    public void pruebaDelMotor(){
        System.out.println("Poniendo a prueba el motor");
    }
}
