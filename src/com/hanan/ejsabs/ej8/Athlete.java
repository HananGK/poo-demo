package com.hanan.ejsabs.ej8;

public class Athlete extends Person{
    @Override
    public void eat() {
        System.out.println("Atleta comiendo su dieta elaborada por el nutricionista");
    }

    @Override
    public void exercise() {
        System.out.println("Rutina del atleta: Salir a correr a las 6 de la mañana, después ir al gym con su entrenador personal, por la tarde nadar y por la noche yoga de relax.");
    }
}
