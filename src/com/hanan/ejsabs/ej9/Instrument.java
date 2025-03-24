package com.hanan.ejsabs.ej9;

/*9. Escribe un programa Java para crear una clase abstracta Instrument con los
métodos abstractos play() y tune(). Crea subclases para Glockenspiel y Violin que
extiendan la clase Instrument e implementan los métodos respectivos para tocar y
afinar cada instrumento.*/

public abstract class Instrument {
    public abstract void play();
    public abstract void tune();
}
