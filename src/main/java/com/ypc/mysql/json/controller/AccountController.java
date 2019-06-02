package com.ypc.mysql.json.controller;

import com.google.gson.Gson;
import com.ypc.mysql.json.model.Account;
import com.ypc.mysql.json.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-6-1 20:46
 * @Description:
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    private Gson gson = new Gson();

    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    public Map<String,Object> saveUser(@RequestBody Account account) {
        LOGGER.info(">>>> save user action start,user info={} <<<<",gson.toJson(account));
        return accountService.saveUser(account);
    }


    @GetMapping("/get/{id}")
    public Account getById(@PathVariable("id") Integer id) {
        return accountService.findById(id);
    }

}
