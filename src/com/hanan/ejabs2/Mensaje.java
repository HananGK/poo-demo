package com.hanan.ejabs2;
/*Se trata de crear una app donde habra diferentes objetos que podran enviar un
 mensaje utilizando las siguientes tecnologias: email, sms, mensaje grabado.
 El mensaje en si mismo es independiente de la forma en que se enviara.
 Resolver la arquitectura de la app
 */

public abstract class Mensaje {
    public abstract void enviarMensaje();
}
