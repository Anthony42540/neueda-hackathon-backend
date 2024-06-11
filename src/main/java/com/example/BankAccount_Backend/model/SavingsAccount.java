package com.example.BankAccount_Backend.model;

import java.util.ArrayList;

public class SavingsAccount implements BankAccount {
    private String id = "";
    private int routing_num = 0;
    private double balance = 0.0;
    private final String TYPE = "Savings";
    private ArrayList<Double> transactionHistory = new ArrayList<>();

    public SavingsAccount(double openingBalance, String idStr) {
        routing_num = 12;
        balance = openingBalance;
        id = idStr;
        transactionHistory.add(openingBalance);
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
        transactionHistory.add(num);
    }

    public String getTYPE() {
        return TYPE;
    }

    public ArrayList<Double> getTransactionHistory() {
        return transactionHistory;
    }

    public void withdraw(double num) {
        return;
    }

    @Override
    public String toString(){
        String returner = "ID="+id+
                "\nRouting Number="+routing_num+
                "\nBalance= $"+balance+
                "\nType= " + TYPE +
                "\nTransaction History= ";
        for(Double transaction: transactionHistory){
            returner += transaction + "\n";
        }
        return returner;
    }
}