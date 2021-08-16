package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserMapper{

    @Autowired
    protected UserMapper userMapper;

    public User get(int id){
        return userMapper.get(id);
    }

    public int add(User user){
        return userMapper.add(user);
    }

    public int update(User user){
        return userMapper.update(user);
    }

    public int del(int id){
        return userMapper.del(id);
    }

    public List<User> list(){
        return userMapper.list();
    }


}
