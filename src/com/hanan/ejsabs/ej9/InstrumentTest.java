package com.hanan.ejsabs.ej9;

public class InstrumentTest {
    public static void main(String[] args) {
        Violin violin = new Violin();
        Glockenspiel glockenspiel = new Glockenspiel();

        Instrument[] instruments = {violin, glockenspiel};
        for (Instrument instrument : instruments) {
            instrument.tune();
            instrument.play();
        }
    }
}
