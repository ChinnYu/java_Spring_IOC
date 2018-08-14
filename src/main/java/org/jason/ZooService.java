package org.jason;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: c6_2
 * @description:
 * @author: Liu
 * @create: 2018-08-14
 */
@Service
public class ZooService {
    //自動裝配
//    @Autowired
//    @Qualifier("dog")
//    IFly animals;

    //自動裝配
    //@Resource(name = "dog")
    IFly animals;

    //裝配給方法
//    public ZooService(@Autowired @Qualifier("pig") IFly animals){
//        this.animals=animals;
//    }



    public void play(){
        System.out.println("開始遊戲");
        animals.fly();
    }
}
