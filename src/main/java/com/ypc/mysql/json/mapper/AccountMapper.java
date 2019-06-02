package com.ypc.mysql.json.mapper;

import com.ypc.mysql.json.model.Account;

public interface AccountMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Account record);
}