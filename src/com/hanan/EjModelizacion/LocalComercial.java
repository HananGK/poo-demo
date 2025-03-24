package com.hanan.EjModelizacion;

public class LocalComercial extends Locales{
    private String CentroComercial;

    public LocalComercial(int identificadorInmobiliario, String direccion, int areaM2, boolean localizacionInterna, String centroComercial) {
        super(identificadorInmobiliario, direccion, areaM2, 3000, localizacionInterna);
        CentroComercial = centroComercial;
    }

    public String getCentroComercial() {
        return CentroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        CentroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "CentroComercial='" + CentroComercial + '\'' +
                "} " + super.toString();
    }
}
