package com.hanan.EjModelizacion;

public class ApartamentoFamiliar extends Apartamento{
    private double valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, String direccion, int areaM2, int numHabitaciones, int numBanos, double valorAdministracion) {
        super(identificadorInmobiliario, direccion, areaM2, 2000, numHabitaciones, numBanos);
        this.valorAdministracion = valorAdministracion;
    }

    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public String toString() {
        return "ApartamentoFamiliar{" +
                "valorAdministracion=" + valorAdministracion +
                "} " + super.toString();
    }
}
