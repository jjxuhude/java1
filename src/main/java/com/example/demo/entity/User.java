package com.example.demo.entity;

import java.util.Date;

public class User {
    protected Integer id;
    protected String name;
    protected Integer age;
    protected Boolean status;
    protected Date created_at;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", status='" + status + '\'' +
                ", created_at='" + created_at + '\'' +
                '}';
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.status = true;
        this.created_at=new Date();

    }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = true;
        this.created_at=new Date();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}
