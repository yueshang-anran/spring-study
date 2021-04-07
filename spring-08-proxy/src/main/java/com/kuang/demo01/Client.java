package com.kuang.demo01;

/**
 * @author 书
 * @date 2021/3/31 - 19:31
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
