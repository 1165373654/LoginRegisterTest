package com.pigindustry.springbootMybatisTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pigindustry.springbootMybatisTest.entity.User;
import com.pigindustry.springbootMybatisTest.mapper.UserMapper;

@Service
public class UserService {
    
    @Autowired
    UserMapper userMapper;
    
    
    public User selectUser(User user){
        return  userMapper.selectUser(user.getUserName(), user.getPassword());
    }

    
}