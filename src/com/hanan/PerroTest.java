package com.hanan;


public class PerroTest {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.setName("Yuno");
        System.out.println(perro1.getName());
        perro1.setBreed("Labrador");
        System.out.println(perro1.getBreed());
        perro1.setSize("Grande");
        System.out.println(perro1.getSize());
        perro1.bark();

        Perro perro2 = new Perro();
        perro2.setName("Boira");
        System.out.println(perro2.getName());
        perro2.setBreed("Chihuahua");
        System.out.println(perro2.getBreed());
        perro2.setSize("Pequeño");
        System.out.println(perro2.getSize());
        perro2.bark();

        Perro perro3 = new Perro();
        perro3.setName("Ricitos");
        System.out.println(perro3.getName());
        perro3.setBreed("Caniche");
        System.out.println(perro3.getBreed());
        perro3.setSize("Mediano");
        System.out.println(perro3.getSize());
        perro3.bark();

    }
}
