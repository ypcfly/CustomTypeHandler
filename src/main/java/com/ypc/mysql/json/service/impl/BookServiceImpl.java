package com.ypc.mysql.json.service.impl;

import com.google.gson.Gson;
import com.ypc.mysql.json.mapper.BookMapper;
import com.ypc.mysql.json.model.Book;
import com.ypc.mysql.json.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-6-1 13:29
 * @Description:
 */
@Service
public class BookServiceImpl implements BookService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookMapper bookMapper;

    private Gson gson = new Gson();

    @Override
    public Map<String, Object> saveBook(Book book) {
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("success",false);

        int insert = bookMapper.insert(book);
        if (insert != 1) {
            LOGGER.error(">>>> save book failed <<<<");
            return resultMap;
        }

        resultMap.put("success",true);

        return resultMap;
    }
}
