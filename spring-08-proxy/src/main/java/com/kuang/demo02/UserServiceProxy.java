package com.kuang.demo02;

/**
 * @author 书
 * @date 2021/3/31 - 19:44
 */
public class UserServiceProxy {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    private void log(String msg) {
        System.out.println("使用了[" + msg + "]方法");
    }
}
