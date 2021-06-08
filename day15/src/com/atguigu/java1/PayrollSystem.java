package com.atguigu.java1;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Please in put Month");
//		int month = scan.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1;// 从零开始的
//		
		Employee[] emps = new Employee[2];
		
		emps[0] = new SalariedEmployee("Mason", 1002, new MyDate(1992, 2, 28), 10000);
		emps[1] = new HourlyEmployee("Yusheng Pan", 2001, new MyDate(1991, 1, 28), 60, 240);
		
		for (int i = 0; i < emps.length; i ++) {
			System.out.println(emps[i]);
			double salary = emps[i].earnings();
			System.out.println("Monthly income: " + salary);
			
			if(month == emps[i].getBirthday().getMonth()) {
				System.out.println("Happy Birthday");
			}
			
			
		}

	}
}
