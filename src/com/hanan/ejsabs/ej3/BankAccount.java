package com.hanan.ejsabs.ej3;

/*3. Escribe un programa Java para crear una clase abstracta BankAccount con los
métodos abstractos deposit() y retreat(). Cree las subclases SavingsAccount y
CurrentAccount que extiendan la clase BankAccount e implementen los métodos
respectivos para manejar depósitos y retiros para cada tipo de cuenta.*/

public abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void retreat(double amount);
}
