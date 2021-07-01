package com.atguigu.java;

import org.junit.Test;

import java.time.*;

public class JDK8DateTimeTest {
    @Test
    public void test2(){
        Instant instant = Instant.now();
        System.out.println(instant);
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(-4));
        System.out.println(offsetDateTime);

        long milli = instant.toEpochMilli();
        System.out.println(milli);
    }
    @Test
    public void test1(){
        //1. instanticate static method now()
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        //2. instantiate of()
        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 6, 21, 15, 0, 0);
        System.out.println(localDateTime1);
        // getXXX()
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMonth());
        // withXXX
        LocalDate localDate1 = localDate.withDayOfMonth(10);
        System.out.println(localDate1);
        System.out.println(localDate);
    }
}
