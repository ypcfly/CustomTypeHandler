package com.ypc.mysql.json.service;

import com.ypc.mysql.json.model.User;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-5-28 21:42
 * @Description:
 */
public interface UserService {

    Map<String, Object> saveUser(User user);

    User findById(Integer id);

    Map<String, Object> updateUser(Integer userId, User user);
}
