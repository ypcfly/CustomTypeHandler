package com.ypc.mysql.json.mapper;

import com.ypc.mysql.json.model.User;

public interface UserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

}