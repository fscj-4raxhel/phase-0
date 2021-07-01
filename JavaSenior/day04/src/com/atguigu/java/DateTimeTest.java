package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * DateTime API test preiro to JDK 8
 */
public class DateTimeTest {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        // instantiate SimpleDateFomat
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        // 1. format
        String formatted = sdf.format(date);
        System.out.println(formatted);
        // 2. parse
        String str = "19/06/21 10:32 PM";
        Date date1 = sdf.parse(str);
        System.out.println(date1);

        // ******** this is not good, let's us the isofomat

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        sdf1.format(date1);

        Date date2 = sdf1.parse("2021-04-03 10:22:32");
        System.out.println(date2);

    }
    @Test
    public void testExercise() throws ParseException {
        String str = "2021-08-01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date date = new java.sql.Date(sdf.parse(str).getTime());
        System.out.println(date.getClass());

    }

}
