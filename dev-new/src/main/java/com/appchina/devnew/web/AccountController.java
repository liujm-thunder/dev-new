package com.appchina.devnew.web;

import com.appchina.devnew.entity.Account;
import com.appchina.devnew.mapper.AccountMapper;
import com.appchina.devnew.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController restful风格 api
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;


    @Autowired
    AccountMapper accountMapper;

    @GetMapping(value = "/beetl")
    public String test(Model model){
        Map<String,Object> user=new HashMap<>();
        user.put("id", 1111);
        user.put("name", "应用汇大神们");
        user.put("description", "新版开发者后台");
        model.addAttribute("user", user);
        return "test";
    }


    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public  String index(Model model){
        List<Account> list = accountMapper.findAccountList();
        model.addAttribute("iterms",list);
        return "index";
    }

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public  List<Account> getlist(){
        return accountMapper.findAccountList();
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  List<Account> getAccounts(){
       return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public  Account getAccountById(@PathVariable("id") int id){
        return accountService.findAccountById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public  String updateAccount(@PathVariable("id")int id , @RequestParam(value = "name",required = true)String name,
    @RequestParam(value = "money" ,required = true)double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        int t=accountService.update(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public  String postAccount( @RequestParam(value = "name")String name,
                                 @RequestParam(value = "money" )double money){
        Account account=new Account();
        account.setMoney(money);
        account.setName(name);
        int t= accountService.add(account);
        if(t==1){
            return account.toString();
        }else {
            return "fail";
        }

    }

}
