package com.atguigu.exer;

import java.util.Map;

public class DAO<T>{
    Map<String, T> map;

    public void save(String id, T entity){
        this.map.put(id,entity);
    }

    public T get(String id){
        return this.map.get(id);
    }

    public void update(String id, T entity){
        this.map.put(id,entity);
    }

}
