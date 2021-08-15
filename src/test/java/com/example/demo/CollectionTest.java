package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;

@SpringBootTest
public class CollectionTest {

    @Test
    public void arrayListTest(){
        ArrayList arrayListIns1= new ArrayList();

        arrayListIns1.add(1);
        arrayListIns1.add(11);
        arrayListIns1.add(1111);
        arrayListIns1.add(11111);

        arrayListIns1.set(2,111);

        System.out.printf("大小：%d \n",arrayListIns1.size());
        System.out.printf("包含：%b \n",arrayListIns1.contains(11));
        System.out.printf("为空：%b \n",arrayListIns1.isEmpty());
        System.out.printf("indexOf：%d \n",arrayListIns1.indexOf(11));




        arrayListIns1.remove(0);
        for(int i=0;i<arrayListIns1.size();i++){
            System.out.println(arrayListIns1.get(i));
        }
    }
}
