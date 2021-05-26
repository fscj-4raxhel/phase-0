package com.atguigu.exer;
/*
 * 利用OOP的编程方法，设计类Circle计算圆的面积
 * 
 */


public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.radius = 5;
		double area = c1.findArea();
		System.out.println(area);
		
	}
}

class Circle{
	//属性
	double radius;
	
	//求面积
	public double findArea() {
		return Math.PI * radius * radius;
	}
	
}
