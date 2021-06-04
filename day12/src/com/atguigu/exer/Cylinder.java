package com.atguigu.exer;

public class Cylinder extends Circle {
	private double length;

	public Cylinder() {
		this.length = 1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double findVolume() {
		return findArea() * this.getLength();
	}

	public double findArea() {
		return 2 * Math.PI * getRadius() * getRadius() + 2 * Math.PI + getLength();
	}
}
