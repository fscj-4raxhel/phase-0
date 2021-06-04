package com.atguigu.java;

public class CircleTest {
	
	public static void main(String[] args) {
		
	Circle c1 = new Circle();
	
	Circle c2 = new Circle();
	Circle c3 = new Circle(3.123);
	System.out.println("c1的id" + c1.getId());
	System.out.println("c2的id" + c2.getId());
	
	System.out.println("Created " + Circle.getTotal() + " circles");
	}
	
			
}

class Circle{
	
	private double radius;
	private int id;
	
	public Circle() {
		id = init++;
		total++;
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	private static int total;//记录创建的圆的个数
	private static int init = 100;
	
	
	public double findArea() {
		return 3.14 * radius * radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public static int getTotal() {
		return total;
	}
}