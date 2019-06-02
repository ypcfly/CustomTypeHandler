package com.ypc.mysql.json.service.impl;

import com.google.gson.Gson;
import com.ypc.mysql.json.mapper.AccountMapper;
import com.ypc.mysql.json.model.Account;
import com.ypc.mysql.json.model.Address;
import com.ypc.mysql.json.model.Family;
import com.ypc.mysql.json.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-6-1 20:51
 * @Description:
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountMapper accountMapper;

    private Gson gson = new Gson();

    @Override
    public Map<String, Object> saveUser(Account account) {
        LOGGER.info(">>>> save account service start,account;{} <<<<",gson.toJson(account));
        Map<String,Object> resultMap = new HashMap<>();

        int insert = accountMapper.insert(account);
        if (insert != 1) {
            // TODO throw exception
            LOGGER.error(">>>> error message when insert new account,result count={} <<<<",insert);
        }
        resultMap.put("success",true);
        resultMap.put("code",200);
        return resultMap;
    }

    @Override
    public Account findById(Integer id) {
        LOGGER.info(">>>> find by id,id={} <<<<",id);
        Account account = accountMapper.selectByPrimaryKey(id);
        String addressStr = account.getAddress();
        Address address = gson.fromJson(addressStr, Address.class);
        LOGGER.info(">>>> get address model, address to string:{} <<<<",address);
        String familyStr = account.getFamily();
        Family family = gson.fromJson(familyStr,Family.class);
        LOGGER.info(">>>> get family model, family to string:{} <<<<",family);

        return account;
    }
}
