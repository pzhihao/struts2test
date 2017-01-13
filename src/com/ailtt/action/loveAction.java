package com.ailtt.action;

import com.ailtt.bean.Book;
import com.ailtt.service.BookService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/1/13.
 */
public class loveAction extends ActionSupport {

    @Autowired
    BookService bookService;
    private static final Logger t = Logger.getLogger("t");

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public String execute() throws Exception {
        List<Book> allBook = bookService.findAllBook();

        for (int i = 0; i < allBook.size(); i++) {
            Book book = allBook.get(i);
            t.info("信息："+book.getName());
        }



        return "success";
    }
}
