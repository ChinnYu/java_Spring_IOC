package com.jason.service;


import com.jason.dao.IBookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: c6_2
 * @description:圖書業務
 * @author: Liu
 * @create: 2018-08-13
 */
public class BookService {

    IBookDao bookDao;

    public BookService(){
        //根據ioc.xml配置文件初始化spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc01.xml");
        //從容器中獲得實體(bean)
        bookDao = ctx.getBean("bookdao",IBookDao.class);

    }
    /**
        *進貨
        * @param name
        */
    public void save(String name){
        bookDao.addBook(name);
    }
}
