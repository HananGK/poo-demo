package com.hanan.EjModelizacion;

public class CasaRural extends Casa{
    private double distanciaCabeceraMunicipal;
    private double AltitudNivelMar;

    public CasaRural(int identificadorInmobiliario, String direccion, int areaM2, int numHabitaciones, int numBanos, int numPisos, double distanciaCabeceraMunicipal, double altitudNivelMar) {
        super(identificadorInmobiliario, direccion, areaM2, 1500, numHabitaciones, numBanos, numPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        AltitudNivelMar = altitudNivelMar;
    }

    public double getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public void setDistanciaCabeceraMunicipal(double distanciaCabeceraMunicipal) {
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
    }

    public double getAltitudNivelMar() {
        return AltitudNivelMar;
    }

    public void setAltitudNivelMar(double altitudNivelMar) {
        AltitudNivelMar = altitudNivelMar;
    }

    public String toString(){
        return "Casa Rural { Identificador inmobiliario: " + getIdentificadorInmobiliario()+ ", Área: " + getAreaM2() + "m2, dirección: " + getDireccion() + ", valor de compra: " + getValorCompra() + ", numero de habitaciones: " + getNumHabitaciones() + ", numero de baños: " + getNumBanos() + ", numero de pisos: " + getNumPisos() + ", distancia cabecera municipal: " + getDistanciaCabeceraMunicipal() + ", altitud nivel mar: " + getAltitudNivelMar() + '}';
    }
}
