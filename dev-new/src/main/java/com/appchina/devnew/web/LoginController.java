package com.appchina.devnew.web;

import com.appchina.account.service.AccountService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/login")
public class LoginController{
    private static final Log LOG = LogFactory.getLog(LoginController.class);

    @Autowired
    private AccountService accountService;


    @RequestMapping(method = RequestMethod.GET)
    public String get(){
        return "redirect:/index";
    }


}
