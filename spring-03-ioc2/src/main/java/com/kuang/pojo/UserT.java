package com.kuang.pojo;

/**
 * @author 书
 * @date 2021/3/29 - 19:28
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
