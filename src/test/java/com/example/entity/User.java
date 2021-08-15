package com.example.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    protected  String name;
    protected  int age;
    protected String date;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public User(){}
    public User(String name,int age,String date){
        this.name=name;
        this.age=age;
        this.date=date;
    }
    public User(String name,int age,Date date){
        this.name=name;
        this.age=age;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        this.date=sdf.format(date);
    }

}
