package com.hanan.ejabs2;

public class MensajeTest {
    public static void main(String[] args) {
        Sms mensajeSms = new Sms("¿Qué pasa Neng?");
        Email mensajeEmail = new Email("Feliz día de Andalucía!!!");
        MensajeGrabado mensajeGrabado = new MensajeGrabado("Montoya va donde brilla");
        Encriptadora mensajeEncriptado = new Encriptadora("ey, que tal estas?");

        Mensaje[] mensajes = {mensajeSms, mensajeEmail, mensajeGrabado, mensajeEncriptado};
        for (Mensaje mensaje : mensajes) {
            mensaje.enviarMensaje();
        }
    }
}
