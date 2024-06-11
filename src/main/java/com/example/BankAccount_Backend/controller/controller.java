package com.example.BankAccount_Backend.controller;

import com.example.BankAccount_Backend.model.BankAccount;
import com.example.BankAccount_Backend.service.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bankaccounts")
@CrossOrigin

public class controller {

    @Autowired
    private ClientInterface client;

    @GetMapping("/{ssn}")
    public List<BankAccount> getAccounts(@PathVariable("ssn") int ssn) {
        return client.getAccounts();
    }

    @GetMapping("/{ssn}/{routing_num}")
    public BankAccount getAccount(@PathVariable("routing_num") int routing_num) {
        for (BankAccount account : client.getAccounts()) {
            if (account.getRouting() == routing_num) {
                return account;
            }
        }
        return null;
    }
}
