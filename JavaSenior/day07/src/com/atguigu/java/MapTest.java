package com.atguigu.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    /**
     * Set keySet():返回所有key构成的Set集合
     * Collection values():返回所有value构成的Collection集合
     * Set entrySet():返回所有key-value对构成的Set集合
     *
     */
    @Test
    public void test(){

        Map map = new HashMap();
        map.put("AA",123);
        map.put(34,123);
        map.put("BB",123);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
