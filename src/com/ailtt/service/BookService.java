package com.ailtt.service;

import com.ailtt.bean.Book;
import com.ailtt.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/1/13.
 */

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> findAllBook(){
        return bookDao.findAll();
    }

    public void add(Book book){
        bookDao.add(book);
    }
}
