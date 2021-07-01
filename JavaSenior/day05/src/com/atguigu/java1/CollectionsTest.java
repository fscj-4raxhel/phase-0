package com.atguigu.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
  1. 集合、数组都是对多个数据进行存储操作的结构，简称Java容器
  此时的存储都是内存层面的，不涉及到持久化层米那个的存储
  2.1 数组在存储多个数据方面的特点
   一旦初始化以后，其长度就确定了
  数组一旦定义好，其元素的类型也就确定了，我们也就只能操作指定类型的数据了。
  2.2 数组在存储多个数据方面的缺点：
   一旦初始化以后，长度就不能修改了
  数组中提供的方法非常有限，对于添加、删除、插入数据等操纵，非常不便，效率不高。
  获取数组中实际元素的个数的需求，数组没有现成的属性和方法可用
  数组是连续存储的特点：有序、可重复。对于无序、不可重复的需求，不能满足

 */
public class CollectionsTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(123);
        coll.add(new Date());

        System.out.println(coll.size());

        //addAll()
        ArrayList coll1 = new ArrayList();
        coll1.add(345);
        coll1.add("CC");
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);
        for (int i = 0; i < coll1.size(); i++) {
            System.out.println(coll1.get(i).getClass());

        }

        //isEmpty()
        System.out.println(coll.isEmpty());

        //clear()
        coll.clear();
        System.out.println(coll.isEmpty());
    }

}
