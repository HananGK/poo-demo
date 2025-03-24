package com.hanan.ejsabs.ej5;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();

        Employee[] employees = {manager,programmer};

        for (Employee employee : employees) {
            employee.displayInfo();
            employee.calculateSalary();
        }
    }
}
