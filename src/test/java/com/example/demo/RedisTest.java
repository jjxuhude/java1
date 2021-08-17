package com.example.demo;

import com.example.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void value() {
        redisTemplate.opsForValue().set("name", "徐华德");
        redisTemplate.opsForValue().set("age", "44");

        System.out.println(redisTemplate.opsForValue().get("name"));
    }

    @Test
    public void list(){

        ListOperations<String,User> listOps = redisTemplate.opsForList();
        User user1 = new User("张三",28,new Date());
        User user2 = new User("李四",18,new Date());
        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        //写入redis
        listOps.leftPushAll("users",userList);
        //控制台
        List<User> lists = listOps.range("users", 0, -1);
        lists.forEach(user-> System.out.println(user.getName()+" "+user.getAge()+" "+user.getDate()));

    }

}
