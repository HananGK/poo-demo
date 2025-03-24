package com.hanan.ejabs1;

public class CocheTest {
    public static void main(String[] args) {
        Todoterreno landRover = new Todoterreno("Land Rover", "negro", 240);
        Deportivo honda =  new Deportivo("Honda", "rojo", 300);
        Familiar renault =  new Familiar("Renault", "azul", 180);

        Coche[] coches = {landRover, honda, renault};
        for (Coche coche : coches) {
            coche.acelerar();
        }

    }
}
