package com.hanan.ejsabs.ej1;

public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        Animal[] animals = {lion,tiger};
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
