package com.hanan.ejinterfaz3;

public class FlyableTest {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();

        Flyable[] flyables = new Flyable[3];
        flyables[0] = spacecraft;
        flyables[1] = airplane;
        flyables[2] = helicopter;

        for (Flyable f : flyables) {
            f.fly_obj();
        }
    }
}
