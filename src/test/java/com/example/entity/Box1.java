package com.example.entity;

public class Box1 <T>{
    private T t;

    public Box1(){
    }
    public Box1(T t){
        this.t=t;
    }
    public void add(T t){
        this.t=t;
    }

    public T get(){
        return t;
    }
}
