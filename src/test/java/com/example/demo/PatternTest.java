package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@SpringBootTest
public class PatternTest {

    @Test
    public void test1() {
        Boolean flag = Pattern.matches("\\d+", "133");
        System.out.println(flag);
    }

    @Test
    public void test2() {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
        Date date = new Date();
        String dateFormat = sdf1.format(date);
        System.out.println(dateFormat);
    }

    @Test
    public void test3() {
        try {
            String str1 = "2002年5月1日8时12分9秒";
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日hh时mm分ss秒");
            Date date=sdf1.parse(str1);
            System.out.println(date.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
