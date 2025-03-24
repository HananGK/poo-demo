package com.hanan.EjModelizacion;

public class CasaUrbanizacion extends CasaUrbana{
    private double valorAdministracion;
    private boolean piscina;
    private boolean camposDeportivos;

    public CasaUrbanizacion(int identificadorInmobiliario, String direccion, int areaM2, int numHabitaciones, int numBanos, int numPisos, double valorAdministracion, boolean piscina, boolean camposDeportivos) {
        super(identificadorInmobiliario, direccion, areaM2, 2500, numHabitaciones, numBanos, numPisos);
        this.valorAdministracion = valorAdministracion;
        this.piscina = piscina;
        this.camposDeportivos = camposDeportivos;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isCamposDeportivos() {
        return camposDeportivos;
    }

    public void setCamposDeportivos(boolean camposDeportivos) {
        this.camposDeportivos = camposDeportivos;
    }

    @Override
    public String toString() {
        return "CasaUrbanizacion{" +
                "valorAdministracion=" + valorAdministracion +
                ", piscina=" + piscina +
                ", camposDeportivos=" + camposDeportivos +
                "} " + super.toString();
    }
}
