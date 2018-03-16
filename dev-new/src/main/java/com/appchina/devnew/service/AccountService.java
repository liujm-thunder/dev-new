package com.appchina.devnew.service;

import com.appchina.devnew.entity.Account;

import java.util.List;

public interface AccountService {


    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}