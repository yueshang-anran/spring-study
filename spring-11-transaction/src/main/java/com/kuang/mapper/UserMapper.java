package com.kuang.mapper;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author 书
 * @date 2021/4/5 - 18:13
 */
public interface UserMapper {
    public List<User> selectUser();

    //增加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUser(int id);
}
