package com.kuang.diy;

/**
 * @author 书
 * @date 2021/3/31 - 21:22
 */
public class DiyPointCut {

    public void before() {
        System.out.println("==========方法执行前============");
    }

    public void after() {
        System.out.println("==========方法执行后============");
    }
}
