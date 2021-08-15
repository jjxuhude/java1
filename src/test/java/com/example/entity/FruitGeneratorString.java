package com.example.entity;

import java.util.Random;

public class FruitGeneratorString implements Generator<String>{

    private   String[] fruits = new String[]{"Apple","Banana","Pear"};

    @Override
    public String next() {
        Random r = new Random();
        return fruits[r.nextInt(3)];
    }
}
