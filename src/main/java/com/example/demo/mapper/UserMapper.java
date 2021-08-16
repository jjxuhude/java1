package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int add(User user);

    User get(int id);

    int update(User user);

    int del(int id);

    List<User> list();

}
