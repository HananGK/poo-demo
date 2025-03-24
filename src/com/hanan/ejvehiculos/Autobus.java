package com.hanan.ejvehiculos;

public class Autobus extends Vehiculo {
    private int numAsientos;
    private int numPuertas;
    private int numVentanillas;

    public Autobus(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas, int numVentanillas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
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

    public int getNumVentanillas() {
        return numVentanillas;
    }

    public void setNumVentanillas(int numVentanillas) {
        this.numVentanillas = numVentanillas;
    }

    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("numAsientos: " + numAsientos);
        System.out.println("numPuertas: " + numPuertas);
        System.out.println("numVentanillas: " + numVentanillas);

    }

    public void pruebaDelMotor(){
        System.out.println("Poniendo a prueba el motor");
    }
}
