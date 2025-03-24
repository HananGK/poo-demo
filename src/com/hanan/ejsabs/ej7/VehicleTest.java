package com.hanan.ejsabs.ej7;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        Vehicle[] vehicles = {car, motorcycle};
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.stopEngine();
        }
    }
}
