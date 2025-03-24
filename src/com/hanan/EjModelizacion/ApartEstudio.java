package com.hanan.EjModelizacion;

public class ApartEstudio extends Apartamento{
    public ApartEstudio(int identificadorInmobiliario, String direccion, int areaM2, int numBanos) {
        super(identificadorInmobiliario, direccion, areaM2, 1500, 1, numBanos);
    }

    @Override
    public String toString() {
        return "ApartEstudio{} " + super.toString();
    }
}
