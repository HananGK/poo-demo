package com.hanan.ejsabs.ej5;

public class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("El salario de Manager oscila entre 35-50k");
    }

    @Override
    public void displayInfo() {
        System.out.println("El manager supervisa proyectos");
    }
}
