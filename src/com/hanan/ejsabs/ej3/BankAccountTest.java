package com.hanan.ejsabs.ej3;

public class BankAccountTest {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount(2400.78);
        SavingsAccount savingsAccount = new SavingsAccount(15000);

        BankAccount[] bankAccounts = {currentAccount, savingsAccount};
        for (BankAccount bankAccount : bankAccounts) {
            bankAccount.deposit(500);
            bankAccount.retreat(125);
        }
    }
}

