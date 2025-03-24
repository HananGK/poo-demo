package com.hanan.ejinterfaz4;

public class SavingsAccount implements Accounts {
    private double balance;
    private double interest;

    public SavingsAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if  (balance >= amount) {
            this.balance -= amount;
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

    public double getBalanceAfterMonths(int months) {
        double balanceAfterMonths = balance;
        for (int i = 1; i <= months; i++) {
            balanceAfterMonths = (balanceAfterMonths*interest)/100;
        }
        return balanceAfterMonths;
    }
}
