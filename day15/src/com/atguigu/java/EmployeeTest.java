package com.atguigu.java;

public class EmployeeTest {
public static void main(String[] args) {
	//polymorphism
	Employee manager = new Manager("Tim Cook", 1001, 5000, 50000);
	
	manager.work();
	CommonEmployee commonEmployee = new CommonEmployee();
	commonEmployee.work();
	
}
}
