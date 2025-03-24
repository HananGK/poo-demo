package com.hanan.polimorfismo;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Lion();
        animals[4] = new Hippo();

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
        }
    }
}
