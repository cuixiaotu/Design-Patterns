package com.day01.demo1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        //1.获取当前时间
        LocalDateTime rightNow = LocalDateTime.now();

        System.out.println(rightNow);
        System.out.println(rightNow.getYear());
        System.out.println(rightNow.getMonth());
        System.out.println(rightNow.getDayOfMonth());
        System.out.println(rightNow.getHour());
        System.out.println(rightNow.getMinute());
        System.out.println(rightNow.getSecond());


        //2.设置时间
        LocalDateTime beforeTime = LocalDateTime.of(2021,12,15,20,38,2,123);

        //3.修改时间
        LocalDateTime updateTime = beforeTime.plusDays(2);
        System.out.println(updateTime);

        updateTime = beforeTime.withYear(1992);
        System.out.println(updateTime);


        //4.格式化时间
        System.out.println(beforeTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(beforeTime.format(DateTimeFormatter.ofPattern("y-M-d HH:mm:ss")));






    }
}
