package com.example.BankAccount_Backend;
import java.util.*;
import java.lang.*;

public class Client {

    private String name;
    private int ssn;
    private String birthday;
    private List<BankAccount> accounts = new ArrayList<>();

    public Client(String name, int ssn, String birthday, BankAccount account){
        this.name = name;
        this.ssn = ssn;
        this.birthday = birthday;
        accounts.add(account);
    }

    public Client(String name, int ssn, String birthday){
        this.name=name;
        this.ssn = ssn;
        this.birthday = birthday;
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
