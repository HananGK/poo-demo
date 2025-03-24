package com.hanan.EjModelizacion;

public class Vivienda extends Inmueble{
    private int numHabitaciones;
    private int numBanos;

    public Vivienda(int identificadorInmobiliario, String direccion, int areaM2, int valorCompra, int numHabitaciones, int numBanos) {
        super(identificadorInmobiliario, direccion, areaM2, valorCompra);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numHabitaciones=" + numHabitaciones +
                ", numBanos=" + numBanos +
                "} " + super.toString();
    }
}
