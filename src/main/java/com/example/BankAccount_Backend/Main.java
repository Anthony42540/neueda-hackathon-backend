package com.example.BankAccount_Backend;

import com.example.BankAccount_Backend.model.BankAccount;
import com.example.BankAccount_Backend.model.CheckingAccount;
import com.example.BankAccount_Backend.service.Client;
import com.example.BankAccount_Backend.model.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount check = new CheckingAccount(500.0, "ThisIsOneID");

        Client joey = new Client();

        BankAccount save = new SavingsAccount(1000.0, "NewAccount");

        joey.addAccount(save);

        System.out.println(joey);
    }

}
