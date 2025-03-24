package com.hanan.ejabs2;

public class Encriptadora extends Mensaje {
    private String mensaje;

    public Encriptadora(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    private String encriptar(String mensaje) {
        return mensaje.replace("e", "3");
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando mensaje: " + encriptar(mensaje) + " por encriptadora");
    }
}
