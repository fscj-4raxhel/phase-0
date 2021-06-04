package com.atguigu.java;


/*
 * 
 * java.lang.Object类的功能具有通用性
 */
public class ObjectTest {
public static void main(String[] args) {
	
	Order order = new Order();
	System.out.println(order.getClass().getSuperclass());
	Object obj = new Object();
	
	
}

}
class Order{}