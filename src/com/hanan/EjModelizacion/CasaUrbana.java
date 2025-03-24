package com.hanan.EjModelizacion;

public class CasaUrbana extends Casa{
    public CasaUrbana(int identificadorInmobiliario, String direccion, int areaM2, int valorCompra, int numHabitaciones, int numBanos, int numPisos) {
        super(identificadorInmobiliario, direccion, areaM2, valorCompra, numHabitaciones, numBanos, numPisos);
    }

    @Override
    public String toString() {
        return "CasaUrbana{} " + super.toString();
    }
}
