package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Random;

@SpringBootTest
public class MybatisTest {

    @Autowired
    protected UserService userService;

    @Test
    public void get(){
        User user = userService.get(1);
        System.out.println(user);
    }

    @Test
    public void add(){
        Random random = new Random();
        int n = random.nextInt(100);
        User user = new User("jack_"+n,44);
        int id = userService.add(user);
        System.out.println(id);
    }

    @Test
    public void update(){
        User user = new User(11,"user33",33);
        int id = userService.update(user);
        System.out.println(id);
    }

    @Test
    public void del(){
        int id = userService.del(11);
        System.out.println(id);
    }

    @Test
    public void list(){
        List<User>  list= userService.list();

        System.out.println("for:");
        for (User user:list) {
            System.out.println(user);
        }
        System.out.println("foreach:");
        list.forEach(user -> {
            System.out.println(user);
        });
    }
}
