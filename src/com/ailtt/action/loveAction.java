package com.ailtt.action;

import com.ailtt.bean.Book;
import com.ailtt.service.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/1/13.
 */
public class loveAction extends ActionSupport{

    @Autowired
    BookService bookService;
    private static final Logger t = Logger.getLogger("t");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("list",allBook);

        return "success";
    }
    public String add(){
        HttpServletRequest request = ServletActionContext.getRequest();

        if ("GET".equals(request.getMethod())){
            request.setAttribute("info","不能进行GET请求");
            return "info";
        }else{
            Book book=new Book();
            book.setName(name);
            bookService.add(book);
            return "input";
        }

    }
}
