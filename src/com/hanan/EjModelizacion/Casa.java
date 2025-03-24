package com.hanan.EjModelizacion;

public class Casa extends Vivienda{
    private int numPisos;

    public Casa(int identificadorInmobiliario, String direccion, int areaM2, int valorCompra, int numHabitaciones, int numBanos, int numPisos) {
        super(identificadorInmobiliario, direccion, areaM2, valorCompra, numHabitaciones, numBanos);
        this.numPisos = numPisos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "numPisos=" + numPisos +
                "} " + super.toString();
    }
}
