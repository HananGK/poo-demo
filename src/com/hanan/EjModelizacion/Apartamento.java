package com.hanan.EjModelizacion;

public class Apartamento extends Vivienda{
    public Apartamento(int identificadorInmobiliario, String direccion, int areaM2, int valorCompra, int numHabitaciones, int numBanos) {
        super(identificadorInmobiliario, direccion, areaM2, valorCompra, numHabitaciones, numBanos);
    }

    @Override
    public String toString() {
        return "Apartamento{} " + super.toString();
    }
}
