package com.hanan.ejcomposicion2;

public class AccountTest {
    public static void main(String[] args) {
        Customer customer = new Customer(3, "Manolo", 10);
        Account account = new Account(5, customer, 4500);

        System.out.println(account);
    }
}
