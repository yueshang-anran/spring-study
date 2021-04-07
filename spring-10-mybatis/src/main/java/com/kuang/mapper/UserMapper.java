package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author 书
 * @date 2021/4/5 - 18:13
 */
public interface UserMapper {
    public List<User> selectUser();
}
