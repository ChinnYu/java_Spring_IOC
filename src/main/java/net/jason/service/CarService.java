package net.jason.service;

import net.jason.dao.ICarDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @program: c6_2
 * @description:
 * @author: Liu
 * @create: 2018-08-13
 */
@Service
public class CarService {
    ICarDao dao;

    public CarService() {

    }

    public void remove(int id){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc02.xml");
        dao = ctx.getBean(ICarDao.class);
        dao.deleteById(id);
    }
}
