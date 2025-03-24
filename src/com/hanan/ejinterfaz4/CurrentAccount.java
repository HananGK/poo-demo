package com.hanan.ejinterfaz4;

public class CurrentAccount implements Accounts{
    private double balance;

    public CurrentAccount(double balance){
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeds your balance");
        }

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double calculateInterest(int interest) {
        return balance + (balance * interest)/100;
    }
}
