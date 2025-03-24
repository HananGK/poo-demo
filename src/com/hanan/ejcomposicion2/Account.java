package com.hanan.ejcomposicion2;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format(getCustomer().getName() + "(" + getCustomer().getId() + ") balance=$" + String.format("%.2f", getBalance()));
    }

    public Account deposit (double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw (double amount) {
        if  (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
