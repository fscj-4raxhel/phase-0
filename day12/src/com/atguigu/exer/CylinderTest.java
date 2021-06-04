package com.atguigu.exer;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cy = new Cylinder();
		cy.setRadius(2.1);
		cy.setLength(3.4);
		double volume = cy.findVolume();
		System.out.println("Volume of the Cylinder is: " + volume);

		double area = cy.findArea();
		System.out.println("Area of th Cirle is: " + area);
	}
}
