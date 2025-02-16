package com.example.BankAccount_Backend.model;

import java.util.ArrayList;
import java.util.Random;

public class SavingsAccount implements BankAccount {
    private String id = "";
    private int routing_num = 0;
    private double balance = 0.0;
    private String clientName = "";
    private final String TYPE = "Savings";
    private ArrayList<Double> transactionHistory = new ArrayList<>();

    public SavingsAccount(double openingBalance, String idStr, String clientName) {
        Random rand = new Random();
        routing_num = rand.nextInt(10000, 99999);
        balance = openingBalance;
        id = idStr;
        transactionHistory.add(openingBalance);
        this.clientName = clientName;
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

    public String getClientName() {
        return clientName;
    }
}