package com.ypc.mysql.json.service;

import com.ypc.mysql.json.model.Account;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-5-31 20:50
 * @Description:
 */
public interface AccountService {
    Map<String, Object> saveUser(Account account);

    Account findById(Integer id);
}
