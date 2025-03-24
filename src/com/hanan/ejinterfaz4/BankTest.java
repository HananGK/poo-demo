package com.hanan.ejinterfaz4;

public class BankTest {
    public static void main(String[] args) {
        Bank  bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(100.0, 10.5);
        CurrentAccount currentAccount = new CurrentAccount(50);
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);
        System.out.println(bank.getAccount(1).getBalance());
        System.out.println(bank.getAccount(0).calculateInterest(50));
        System.out.println(bank.getTotalBalance());
        bank.getAccount(1).deposit(10);
        System.out.println(bank.getAccount(1).getBalance());
        System.out.println(bank.getTotalBalance());
        System.out.println(savingsAccount.getBalanceAfterMonths(10));

    }
}
