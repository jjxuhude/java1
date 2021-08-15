package com.example.entity;

import java.util.Date;

public class User {
    protected  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    protected  int age;
    protected Date date;

    public User(){}
    public User(String name,int age,Date date){
        this.name=name;
        this.age=age;
        this.date=date;
    }

}
