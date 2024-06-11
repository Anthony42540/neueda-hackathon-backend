package com.example.BankAccount_Backend.model;

public class SavingsAccount implements BankAccount {
    private String id = "";
    private int routing_num = 0;
    private double balance = 0.0;
    private final String TYPE = "Savings";
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

    public String getTYPE() {
        return TYPE;
    }

    public String getTransactionHistory() {
        return transactionHistory;
    }

    @Override
    public String toString(){
        return "ID="+id+
                "\nRouting Number="+routing_num+
                "\nBalance= $"+balance+
                "\nType= " + TYPE +
                "\nTransaction History= " + transactionHistory;
    }
}