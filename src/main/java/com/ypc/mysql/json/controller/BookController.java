package com.ypc.mysql.json.controller;

import com.google.gson.Gson;
import com.ypc.mysql.json.model.Book;
import com.ypc.mysql.json.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: ypcfly
 * @Date: 19-6-1 13:25
 * @Description:
 */
@RestController
@RequestMapping("/book")
public class BookController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    private Gson gson = new Gson();

    @PostMapping("/save")
    public Map<String,Object> saveUser(@RequestBody Book book) {
        LOGGER.info(">>>> save book action start,book info={} <<<<",gson.toJson(book));
        return bookService.saveBook(book);
    }
}
