package com.hanan.ejsabs.ej9;

public class Violin extends Instrument{
    @Override
    public void play() {
        System.out.println("Tocando el violin");
    }

    @Override
    public void tune() {
        System.out.println("Afinando el violin");
    }
}
