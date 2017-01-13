package com.ailtt.dao;

import com.ailtt.bean.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/1/13.
 */

@Repository
public class BookDaoImpl extends HibernateDaoSupport implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Resource(name = "sessionFactory")
    public void setSuperSessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public List<Book> findAll() {
        Session currentSession = sessionFactory.getCurrentSession();

        NativeQuery nativeQuery = currentSession.createNativeQuery("select * from t_book");
        nativeQuery.addEntity(Book.class);

        return nativeQuery.list();
    }

    @Override
    public void add(Book book) {
        sessionFactory.getCurrentSession().save(book);
    }
}
