package com.ypc.mysql.json.controller;

import com.google.gson.Gson;
import com.ypc.mysql.json.model.Address;
import com.ypc.mysql.json.model.User;
import com.ypc.mysql.json.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-6-1 21:38
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    private Gson gson = new Gson();

    @PostMapping("/save")
    public Map<String,Object> saveUser(@RequestBody User user) {
        LOGGER.info(">>>> save user action start,user info={} <<<<",gson.toJson(user));
        return userService.saveUser(user);
    }

    @PostMapping("/update/{userId}")
    public Map<String,Object> updateUser(@RequestBody User user, @PathVariable("userId") Integer userId) {
        LOGGER.info(">>>> update user address action start,userId={}, user={} <<<<",userId,gson.toJson(user));

        return userService.updateUser(userId,user);
    }

    @GetMapping("/get/{id}")
    public User getById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @RequestMapping("/query")
    public List<User> queryByCondition(@RequestParam("key")String key, @RequestParam("value")String value, @RequestParam("column")String column) {

        return userService.queryByCondition(column,key,value);
    }


}
