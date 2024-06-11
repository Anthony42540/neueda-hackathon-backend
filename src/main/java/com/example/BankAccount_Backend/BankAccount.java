package com.example.BankAccount_Backend;
public interface BankAccount {
    public double getBalance();
    public String getID();
    public int getRouting();

    public void setBalance(double num);
    public void setID(String string);
    public void setRouting(int num);

    public void deposit(double num);
    public String toString();
}
