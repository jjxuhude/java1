package com.example.demo;

import com.example.entity.Box;
import com.example.entity.Box1;
import com.example.entity.FruitGeneratorString;
import com.example.entity.fruit.Apple;
import com.example.entity.fruit.Banana;
import com.example.entity.fruit.Fruit;
import com.example.entity.fruit.Pear;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class GenericTest {

    @Test
    public void demo1Test(){
        Box<Integer> boxInteger =new Box<Integer>(1234);
        Box<String> boxString = new Box<String>("jack");
        System.out.printf("generic test : %s \n",boxInteger.getData());
        System.out.printf("generic test : %s \n",boxString.getData());
    }

    @Test
    public void demo2Test(){
        Box box1 = new Box("1111");
        Box box2 = new Box(2222);
        Box box3 = new Box(true);
        System.out.printf("generic test : %s \n",box1.getData());
        System.out.printf("generic test : %s \n",box2.getData());
        System.out.printf("generic test : %s \n",box3.getData());
        showDataValue(box1);
        showDataValue(box2);
        showDataValue(box3);


    }
    public void showDataValue(Box<?> obj){
        System.out.printf("泛型通配符: %s\n",obj.getData());
    }

    @Test
    public void demo3Test(){
        FruitGeneratorString fruit = new FruitGeneratorString();
        String item = fruit.next();
        System.out.println(item);
    }

    //泛型方法
    @Test
    public void demo4Test(){
        Box box1 = new Box("1111");
        Box box2 = new Box(2222);
        Box box3 = new Box(true);

        box1.showKeyName(box1);


    }

    @Test
    public void demo5Test(){
        Box1 box1Ins1= new Box1("jack");
        Box1<Integer> box1Ins2= new Box1<Integer>(1234);
        String val1 = (String) box1Ins1.get();
        Integer val2 = box1Ins2.get();
        System.out.printf("T:%s \n",val1);
        System.out.printf("T:%d \n",val2);
    }

    @Test
    public void demo6Test(){
        //List first = new ArrayList<Apple>();


    }


}
