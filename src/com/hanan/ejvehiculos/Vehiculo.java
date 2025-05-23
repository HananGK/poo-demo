package com.hanan.ejvehiculos;

public class Vehiculo {
    private int precioDia;
    private String marcaModelo;
    private int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    public int getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(int precioDia) {
        this.precioDia = precioDia;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas(){
        System.out.println("Precio Día: " + getPrecioDia());
        System.out.println("Marca y modelo: " + getMarcaModelo());
        System.out.println("Numero de llantas: " + getNumLlantas());
    }

    public void encenderMotor(){
        System.out.println("Motor encendido");
    }

    public void apagarMotor(){
        System.out.println("Motor apagado");
    }

    public void funciona(){
        System.out.println("Va de lujo. Brrrrrrummmmmm");
    }


}
