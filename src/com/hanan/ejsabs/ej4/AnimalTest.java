package com.hanan.ejsabs.ej4;

public class AnimalTest {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

        Animal[] animals = {lion, tiger, deer};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
