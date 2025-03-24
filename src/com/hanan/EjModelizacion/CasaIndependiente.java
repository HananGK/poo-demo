package com.hanan.EjModelizacion;

public class CasaIndependiente extends CasaUrbana{
    public CasaIndependiente(int identificadorInmobiliario, String direccion, int areaM2, int numHabitaciones, int numBanos, int numPisos) {
        super(identificadorInmobiliario, direccion, areaM2, 3000, numHabitaciones, numBanos, numPisos);
    }

    @Override
    public String toString() {
        return "CasaIndependiente{} " + super.toString();
    }
}
