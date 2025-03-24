package com.hanan;

public class Player {
    private String name;
    private int respuesta;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int guess(){
        respuesta = (int)(Math.random()*10);
        return respuesta;
    }
}
