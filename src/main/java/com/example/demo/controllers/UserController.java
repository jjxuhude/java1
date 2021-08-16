package com.example.demo.controllers;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    protected UserService userService;

    @ResponseBody
    @RequestMapping("/selectAll")
    public String selectAll(){
        return "selectAll";
    }

    @ResponseBody
    @RequestMapping("/get/{id}")
    public String get(@PathVariable int id){
        return userService.get(id).getName();
    }




}
