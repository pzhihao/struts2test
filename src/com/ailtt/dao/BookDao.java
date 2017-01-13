package com.ailtt.dao;

import com.ailtt.bean.Book;


import java.util.List;

/**
 * Created by Administrator on 2017/1/13.
 */


public interface BookDao {
    List<Book> findAll();
    void add(Book book);
}
