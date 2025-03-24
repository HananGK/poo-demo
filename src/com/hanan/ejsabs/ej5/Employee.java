package com.hanan.ejsabs.ej5;

/*5. Escriba un programa Java para crear una clase abstracta Employee con los
métodos abstractos calculateSalary() y displayInfo(). Cree las subclases Manager
y Programmer que extiendan la clase Employee e implementen los métodos
respectivos para calcular el salario y mostrar información para cada función.*/

public abstract class Employee {
    public abstract void calculateSalary();
    public abstract void displayInfo();
}
