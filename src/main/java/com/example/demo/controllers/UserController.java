package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    protected UserService userService;

    @ResponseBody
    @RequestMapping("/selectAll")
    public String selectAll(){
        return "selectAll";
    }

    @ResponseBody
    @RequestMapping("/get/{id}")
    public String get(@PathVariable int id){
        log.info("id:{}",id);
        User user = userService.get(id);
        String userinfo = user.toString();
        return userinfo;
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<User> list(){
        List<User> list= userService.list();
        return list;
    }




}
