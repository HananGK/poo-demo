package com.hanan.ejinterfaz4;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Accounts> accounts;

    public Bank(){
        this.accounts=new ArrayList<>();
    }

    public Bank(List<Accounts> accounts){
        this.accounts=accounts;
    }

    public List<Accounts> getAccounts(){
        return accounts;
    }

    public double getTotalBalance2(){
        double totalBalance=0;
        for(Accounts account:accounts){
            totalBalance+=account.getBalance();
        }
        return totalBalance;
    }

    public double getTotalBalance(){
        return accounts.stream().mapToDouble(Accounts::getBalance).sum();
    }

    public Accounts getAccount(int index){
        return accounts.get(index);
    }

    public void addAccount(Accounts account){
        accounts.add(account);
    }
}
