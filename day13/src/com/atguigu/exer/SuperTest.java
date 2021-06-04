package com.atguigu.exer;

public class SuperTest {
	public static void main(String[] args) {
		SuperTest test = new SuperTest();
		
	}
	
	public void displayGeometricObject(GeometricObject o){
		System.out.println("Area is : " + o.findArea());
	}
	
	public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
}
