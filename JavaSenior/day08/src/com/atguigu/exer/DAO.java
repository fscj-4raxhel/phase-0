package com.atguigu.exer;

import java.util.*;

public class DAO<T> {
    Map<String, T> map;

    public DAO() {
        map = new HashMap<String,T>();
    }

    public DAO(Map<String, T> map) {
        this.map = map;
    }

    public void save(String id, T entity) {
        this.map.put(id, entity);
    }

    public T get(String id) {
        if (map.containsKey(id))
            return this.map.get(id);
        else throw new RuntimeException("id " + id + " does not exist");
    }

    public void update(String id, T entity) {
        this.map.put(id, entity);
    }

    public List<T> list() {
        Collection<T> values = this.map.values();
        List<T> res = new ArrayList<>();
        res.addAll(values);
        return res;
    }

    public void delete(String id) {
        if (map.containsKey(id)) map.remove(id);
        else throw new RuntimeException("id " + id + " does not exist");
    }

}
