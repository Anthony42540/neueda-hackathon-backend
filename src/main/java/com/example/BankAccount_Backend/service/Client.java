package com.example.BankAccount_Backend.service;

import com.example.BankAccount_Backend.model.BankAccount;
import com.example.BankAccount_Backend.model.CheckingAccount;
import com.example.BankAccount_Backend.model.SavingsAccount;
import org.springframework.stereotype.Service;

import java.util.*;
import java.lang.*;

@Service
public class Client implements ClientInterface {

    private String name;
    private int ssn;
    private String birthday;
    private List<BankAccount> accounts = new ArrayList<>();

    public Client(){
        name = "Jane Doe";
        ssn = 1234567;
        birthday = "01/01/2000";
        BankAccount account1 = new SavingsAccount(1000.0, "1");
        BankAccount account2 = new CheckingAccount(4000.0, "2");
        this.addAccount(account1);
        this.addAccount(account2);
        account2.deposit(1000);
        account2.withdraw(2000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    @Override
    public String toString(){
        String returner = "Name="+name+
                "\nSSN="+ssn+
                "\nBirthday="+birthday+
                "\nList of accounts:\n";
        for(BankAccount account: accounts){
            returner += account.toString()+"\n";
        }
        return returner;
    }
}
