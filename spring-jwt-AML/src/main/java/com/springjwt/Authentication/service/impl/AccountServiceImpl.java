package com.springjwt.Authentication.service.impl;

import com.springjwt.Authentication.model.User;
import com.springjwt.Authentication.repository.AccountRepository;
import com.springjwt.Authentication.repository.UserRepository;
import com.springjwt.Authentication.service.AccountService;
import com.springjwt.Authentication.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accrepo;
    @Autowired
    UserRepository userr;

    @Override
    public Account addAccount(Account account) {
        return accrepo.save(account);
    }

    @Override
    public List<Account> findAll() {
        return accrepo.findAll();
    }

    @Override
    public  List<Account> findByUserId(Long userid) {
        return accrepo.findByUserId(userid);    }

}
