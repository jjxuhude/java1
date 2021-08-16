package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SpringBootTest
public class JdbcTemplateTest {

    @Autowired
    protected  JdbcTemplate jdbcTemplate;

    @Test
    public void demo1Test(){
        String sql= "select * from users";
        List<Map<String,Object>> userList = jdbcTemplate.queryForList(sql);
        for (Map<String,Object> user:userList){
            Set<Map.Entry<String,Object>> entries = user.entrySet();
            if(entries != null){
                Iterator<Map.Entry<String,Object>> iterator = entries.iterator();
                while (iterator.hasNext()){
                    Map.Entry<String,Object> entry = iterator.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.printf("%s:%s ",key,value);
                }
            }
            System.out.println();
        }
    }


    //foreach
    @Test
    public void demo3Test(){
        String sql= "select * from users";
        List<Map<String,Object>> userList = jdbcTemplate.queryForList(sql);
        for (Map<String,Object> user:userList){
            Set<Map.Entry<String,Object>> entries = user.entrySet();
            if(entries != null){
                entries.forEach((field)->{
                    System.out.println(field.getKey()+" "+field.getValue());
                });
            }
            System.out.println();
        }
    }


}
