package com.ypc.mysql.json.service;

import com.ypc.mysql.json.model.Book;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-6-1 13:28
 * @Description:
 */
public interface BookService {
    Map<String, Object> saveBook(Book book);
}
