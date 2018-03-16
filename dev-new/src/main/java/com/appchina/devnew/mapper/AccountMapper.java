package com.appchina.devnew.mapper;

import com.appchina.devnew.entity.Account;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface AccountMapper {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}