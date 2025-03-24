package com.hanan;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setNum1(5);
        calculadora.setNum2(6);

        System.out.println("Resultado: " + calculadora.suma());

        double random = Math.random();
        System.out.println("Numero aleatorio: " + random);


    }
}
