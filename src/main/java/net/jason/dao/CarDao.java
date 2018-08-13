package net.jason.dao;

import org.springframework.stereotype.Repository;

/**
 * @program: c6_2
 * @description:
 * @author: Liu
 * @create: 2018-08-13
 */
@Repository
public class CarDao implements ICarDao{

    public void deleteById(int id) {
        System.out.println("成功刪除編號為"+id+"的資料");
    }
}
