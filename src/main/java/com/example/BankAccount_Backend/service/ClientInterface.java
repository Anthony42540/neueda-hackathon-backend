package com.example.BankAccount_Backend.service;

import com.example.BankAccount_Backend.model.BankAccount;

import java.util.List;

public interface ClientInterface {
    public String getName();

    public void setName(String name);

    public int getSsn();

    public String getBirthday();

    public List<BankAccount> getAccounts();

    public void addAccount(BankAccount account);
}
