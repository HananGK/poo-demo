package com.hanan.ejsabs.ej11;

/*11. Escribe un programa Java para crear una clase abstracta Bird con los métodos
abstractos fly() y makeSound(). Crea las subclases Eagle y Hawk que extiendan la
clase Bird e implementa los métodos respectivos para describir cómo vuela y
emite un sonido cada ave.*/

public abstract class Bird {
    public abstract void fly();
    public abstract void makeSound();
}
