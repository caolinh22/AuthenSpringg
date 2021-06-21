package com.example.authen.controller;

import com.example.authen.entity.Account;
import com.example.authen.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/generate/account")
public class GenerateAccount {
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AccountRepository accountRepository;

    private static ArrayList<Account> listAccount = new ArrayList<>();
    @RequestMapping(method = RequestMethod.GET)
    public String Seeding() {
        accountRepository.deleteAll();
        Account account1 = new Account(1, "linh1", "linhcao1", passwordEncoder.encode("password@"), 1,1);
        Account account2 = new Account(2, "linh2", "linhcao2", passwordEncoder.encode("password@@"), 2,1);
        Account account3 = new Account(3, "linh3", "linhcao3", passwordEncoder.encode("password@@@"), 1,2);
        for (Account dis :
                listAccount) {
            accountRepository.save(dis);
        }
        return "Seeding Done!";
    }}