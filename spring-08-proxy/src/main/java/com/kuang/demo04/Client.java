package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;

/**
 * @author 书
 * @date 2021/3/31 - 21:14
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //设置要代理的对象
        pih.setTarget(userService);

        //动态生成代理类
        UserService proxy = (UserService)pih.getProxy();

        proxy.add();
    }
}
