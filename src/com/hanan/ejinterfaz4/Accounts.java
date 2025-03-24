package com.hanan.ejinterfaz4;

/*Escribe un programa Java para crear un sistema bancario con tres clases:
Bank, Account, SavingsAccount y CurrentAccount.
El banco debe tener una lista de cuentas y métodos para agregarlas.
Accounts debe ser una interfaz con métodos para depositar, retirar, calcular intereses
y ver saldos. SavingsAccount y CurrentAccount deben implementar la interfaz Account
y tener sus propios métodos únicos.
crear, eliminar, dinero inicial, sumar depositos*/

public interface Accounts {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();

    double calculateInterest(int interest);
}
