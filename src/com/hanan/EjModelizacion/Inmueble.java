package com.hanan.EjModelizacion;

public class Inmueble {
    private int identificadorInmobiliario;
    private int areaM2;
    private String direccion;
    private int valorCompra;

    public Inmueble(int identificadorInmobiliario, String direccion, int areaM2, int valorCompra) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.direccion = direccion;
        this.areaM2 = areaM2;
        this.valorCompra = valorCompra;
    }

    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public int getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(int areaM2) {
        this.areaM2 = areaM2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "identificadorInmobiliario=" + identificadorInmobiliario +
                ", areaM2=" + areaM2 +
                ", direccion='" + direccion + '\'' +
                ", valorCompra=" + valorCompra +
                '}';
    }
}
