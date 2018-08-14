package org.jason;

import org.springframework.stereotype.Component;

/**
 * @program: c6_2
 * @description:
 * @author: Liu
 * @create: 2018-08-14
 */
@Component("pig")
public class Pig implements IFly{

    public void fly() {
        System.out.println("豬在飛");
    }
}
