package com.example.BankAccount_Backend;
import java.util.*;

public class SavingsAccount implements BankAccount {
    private String id = "";
    private int routing_num = 0;
    private double balance = 0.0;
    private final String TYPE = "savings";
    private String transactionHistory;

    public SavingsAccount(double openingBalance, String idStr) {
        routing_num = 12;
        balance = openingBalance;
        id = idStr;
        transactionHistory = "Opened account with $"+openingBalance+".\n";
    }

    public double getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public int getRouting() {
        return routing_num;
    }

    public void setBalance(double num) {
        balance = num;
    }

    public void setID(String string) {
        id = string;
    }

    public void setRouting(int num) {
        routing_num = num;
    }

    public void deposit(double num) {
        balance += num;
        transactionHistory += "Deposited $"+num+".\n";
    }

    @Override
    public String toString(){
        return "ID="+id+
                "\nRouting Number="+routing_num+
                "\nBalance= $"+balance;
    }
}