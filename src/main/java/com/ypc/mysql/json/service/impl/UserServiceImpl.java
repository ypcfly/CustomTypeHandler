package com.ypc.mysql.json.service.impl;

import com.ypc.mysql.json.mapper.UserMapper;
import com.ypc.mysql.json.model.Address;
import com.ypc.mysql.json.model.Child;
import com.ypc.mysql.json.model.Family;
import com.ypc.mysql.json.model.User;
import com.ypc.mysql.json.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-6-1 21:43
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, Object> saveUser(User user) {
        Map<String,Object> resultMap = new HashMap<>();
        //
        int insert = userMapper.insert(user);
        if (insert != 1) {
            LOGGER.error(">>>> save user failed,return count={} <<<<",insert);
            resultMap.put("message","save user to database failed");
            return resultMap;
        }
        resultMap.put("success",true);
        resultMap.put("code",200);
        return resultMap;
    }

    @Override
    public Map<String, Object> updateUser(Integer userId, User user) {
        Map<String,Object> resultMap = new HashMap<>();
        int update = userMapper.updateByPrimaryKey(user);
        if (update != 1) {
            LOGGER.error(">>>> update user failed,return count={} <<<<",update);
            resultMap.put("message","update user to database failed");
            return resultMap;
        }

        resultMap.put("success",true);
        resultMap.put("code",200);
        return resultMap;
    }

    @Override
    public List<User> queryByCondition(String column, String key, String value) {
        LOGGER.info(">>>> query user by condition,column={}, key={}, value={} <<<<",column,key,value);
        List<User> userList = null;
//        key = "$." + key.trim();
        try {
            userList = userMapper.queryByCondition(column,key,value);
        } catch (Exception e) {
            LOGGER.error(">>>> error message={} <<<<",e.getMessage());
        }

        return userList;
    }

    @Override
    public User findById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);

        Address address = user.getAddress();
        Family family = user.getFamily();
        List<Child> children = family.getChildren();
        return user;
    }
}
