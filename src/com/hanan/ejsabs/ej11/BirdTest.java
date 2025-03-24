package com.hanan.ejsabs.ej11;

import com.hanan.ejsabs.ej10.Shape2D;

public class BirdTest {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        Bird[] birds = {eagle, hawk};
        for (Bird bird : birds) {
            bird.fly();
            bird.makeSound();
        }
    }
}
