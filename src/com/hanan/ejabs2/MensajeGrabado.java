package com.hanan.ejabs2;

public class MensajeGrabado extends Mensaje {
    private String mensaje;

    public MensajeGrabado(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando mensaje: " + mensaje + " por mensaje grabado");
    }
}
