package com.atguigu.exer;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DAOTest<T,R>{
    @Test
    public void test1(){
        Map<T,R> map = new HashMap<>();
        Collection<R> values = map.values();
    }
}
