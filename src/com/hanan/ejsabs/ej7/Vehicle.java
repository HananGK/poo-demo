package com.hanan.ejsabs.ej7;

/*7. Escribe un programa Java para crear una clase abstracta Vehicle con los
métodos abstractos startEngine() y stopEngine(). Crea las subclases Car y
Motorcycle que extiendan la clase Vehicle e implementan los métodos respectivos
para encender y apagar los motores de cada tipo de vehículo.*/

public abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}
