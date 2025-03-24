package com.hanan.EjModelizacion;

public class Oficina extends Locales{
    private boolean gobierno;

    public Oficina(int identificadorInmobiliario, String direccion, int areaM2, boolean localizacionInterna, boolean gobierno) {
        super(identificadorInmobiliario, direccion, areaM2, 3500, localizacionInterna);
        this.gobierno = gobierno;
    }

    public boolean isGobierno() {
        return gobierno;
    }

    public void setGobierno(boolean gobierno) {
        this.gobierno = gobierno;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "gobierno=" + gobierno +
                "} " + super.toString();
    }
}
