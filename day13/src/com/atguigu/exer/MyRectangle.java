package com.atguigu.exer;

public class MyRectangle extends GeometricObject {

	private double width;
	private double height;
	
	public MyRectangle(double width, double height, String color, double weight) {
		super(color, weight);
		this.width = width;
		this.height = height;
		
		// TODO Auto-generated constructor stub
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double findArea() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

}
