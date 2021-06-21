package com.example.authen.controller;

import com.example.authen.entity.Account;
import com.example.authen.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;
    @RequestMapping(method = RequestMethod.GET)
    public Account GetAccount(int id) {
        Account account = accountRepository.getById(id);
        return account;
    }
}
