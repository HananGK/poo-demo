package com.hanan.ejsabs.ej3;


public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        double balance = getBalance();
        balance += amount;
        setBalance(balance);
        System.out.println("Se han ingresado " + amount + "€ en la cuenta de ahorros");
        System.out.println("Balance: " + balance);
    }

    @Override
    public void retreat(double amount) {
        double balance = getBalance();
        if (balance >= amount) {
            balance -= amount;
            setBalance(balance);
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("Se han retirado " + amount + "€ en la cuenta de ahorros");
        System.out.println("Balance: " + balance);;
    }
}
