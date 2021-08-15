package com.example.entity;


//未传入泛型实参时
public class FruitGenerator<T> implements  Generator<T>{
    @Override
    public T next() {
        return null;
    }
}
