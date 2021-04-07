package com.kuang.demo02;

/**
 * @author 书
 * @date 2021/3/31 - 19:42
 */
public class Client {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }

}
