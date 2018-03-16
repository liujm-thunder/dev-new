package com.appchina.devnew.service.impl;

import com.appchina.devnew.entity.Account;
import com.appchina.devnew.mapper.AccountMapper;
import com.appchina.devnew.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int add(Account account) {
        return 0;
    }

    @Override
    public int update(Account account) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Account findAccountById(int id) {
        return null;
    }

    @Override
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }

}