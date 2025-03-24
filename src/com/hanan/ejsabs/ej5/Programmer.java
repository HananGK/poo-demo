package com.hanan.ejsabs.ej5;

public class Programmer extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("El salario de Progranador oscila entre 20-35k");
    }

    @Override
    public void displayInfo() {
        System.out.println("El programador desarrolla software");
    }
}
