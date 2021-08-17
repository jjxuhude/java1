package com.example.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello worlds";
    }
}
