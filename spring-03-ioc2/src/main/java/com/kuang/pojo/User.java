package com.kuang.pojo;

/**
 * @author 书
 * @date 2021/3/29 - 19:08
 */
public class User {
    private String name;

    User(String name){
        this.name=name;
        System.out.println("有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name:"+this.name);
    }

}
