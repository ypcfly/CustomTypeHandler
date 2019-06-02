package com.ypc.mysql.json.mapper;

import com.ypc.mysql.json.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(User record);

    List<User> queryByCondition(@Param("column") String column, @Param("key") String key, @Param("value") String value);
}