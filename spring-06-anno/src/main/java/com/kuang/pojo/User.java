package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author 书
 * @date 2021/3/30 - 21:59
 */

@Component
@Scope("singleton")
public class User {

    @Value("dfdf")
    public String name;

    public String getName() {
        return name;
    }

    @Value("dfd")
    public void setName(String name) {
        this.name = name;
    }
}
