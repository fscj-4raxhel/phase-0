package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        //1. contains
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));
        //2. calls the equals methood, if not overrided, then compare address
        System.out.println(coll.contains(new Person("Jerry", 20)));

        Collection coll1 = Arrays.asList(123, 4567);
        System.out.println(coll.containsAll(coll1));

    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        //3. remove
        coll.remove(123);
        System.out.println(coll);

        coll.remove(new Person("Jerry", 20));
        //4. removeAll(Collection coll1)
        Collection coll1 = Arrays.asList(123, 456);
        coll.removeAll(coll1);
        System.out.println(coll);
    }
    @Test
    public void test3() {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);
        //3. remove
        coll.remove(123);
        System.out.println(coll);

//        coll.remove(new Person("Jerry", 20));
        //5. retainAll(Collection coll1)
//        Collection coll1 = Arrays.asList(123, 456);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6. equals()
        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new String("Tom"));
        coll2.add(false);
        coll2.add(p);
        coll2.remove(123);

        System.out.println(coll.equals(coll2));
    }
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        Person p = new Person("Jerry", 20);
        coll.add(p);

        //7. return the hash code of the object declared in java.lang.Object
        System.out.println(coll.hashCode());
        //8.toArray() Collection ==> Array
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //Extension
        List<String> arr1 = Arrays.asList(new String[]{"AA", "BB", "CC"});
        System.out.println(arr1.size());

        List<Integer> arr2 = Arrays.asList(1234, 345);
        System.out.println(arr2.size());
        List<int[]> arr3 = Arrays.asList(new int[]{1234, 345});
        System.out.println(arr3.size());
        //iterator


    }
}
