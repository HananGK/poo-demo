package com.hanan;

public class CalculadoraEstatica {
    private static int num1;
    private static int num2;


    public static int suma(){
        return num1+num2;
    }

    public static int resta(){
        return num1-num2;
    }

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int num1) {
        num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        num2 = num2;
    }
}
