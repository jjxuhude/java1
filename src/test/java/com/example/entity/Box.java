package com.example.entity;

public class Box<T> {
    protected T data;
    public Box(T key){
        this.data = key;
    }
    public T getData(){
        return data;
    }

    //泛型方法
    public <T> T showKeyName(Box<T> obj){
        System.out.println("泛型方法:获取key:" + obj.getData());
        T data = obj.getData();
        return data;
    }

}
