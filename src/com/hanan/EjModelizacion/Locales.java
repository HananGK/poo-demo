package com.hanan.EjModelizacion;

public class Locales extends Inmueble{
    private boolean LocalizacionInterna;

    public Locales(int identificadorInmobiliario, String direccion, int areaM2, int valorCompra, boolean localizacionInterna) {
        super(identificadorInmobiliario, direccion, areaM2, valorCompra);
        LocalizacionInterna = localizacionInterna;
    }

    public boolean isLocalizacionInterna() {
        return LocalizacionInterna;
    }

    public void setLocalizacionInterna(boolean localizacionInterna) {
        LocalizacionInterna = localizacionInterna;
    }

    @Override
    public String toString() {
        return "Locales{" +
                "LocalizacionInterna=" + LocalizacionInterna +
                "} " + super.toString();
    }
}
