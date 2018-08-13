package com.jason.dao;

/**
 * @program: c6_2
 * @description:
 * @author: Liu
 * @create: 2018-08-13
 */
public class BookDaoOracle implements IBookDao{
    public void addBook(String name) {
        System.out.println("成功添加圖書到Oracle:"+name);
    }
}
