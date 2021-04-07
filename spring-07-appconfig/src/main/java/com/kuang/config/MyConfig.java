package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 书
 * @date 2021/3/30 - 22:31
 */

@Configuration
@ComponentScan("com.kuang")
public class MyConfig {

//    @Bean
//    public User user() {
//        //就是要返回注入到bean的对象!
//        return new User();
//    }
}
