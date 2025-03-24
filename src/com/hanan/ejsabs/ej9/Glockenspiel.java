package com.hanan.ejsabs.ej9;

public class Glockenspiel extends Instrument{
    @Override
    public void play() {
        System.out.println("Tocando el Glockenspiel");
    }

    @Override
    public void tune() {
        System.out.println("Afinando el Glockenspiel");
    }
}
