package com.hanan.ejvehiculos;

public class VehiculoTest {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta(20, "Hyosung Aquila", 2, 1);
        Automovil automovil = new Automovil(40, "Ford Focus", 4, 5, 5);
        Autobus autobus = new Autobus(65, "Bus para excursion", 12, 24, 2, 6);


        automovil.mostarDatos();
        automovil.pruebaDelMotor();
        automovil.funciona();

        moto.mostrarDatos();
        moto.encenderMotor();
    }
}
