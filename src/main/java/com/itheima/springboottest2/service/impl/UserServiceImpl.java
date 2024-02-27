package com.itheima.springboottest2.service.impl;

import com.itheima.springboottest2.mapper.UserMapper;
import com.itheima.springboottest2.pojo.User;
import com.itheima.springboottest2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
