package com.atguigu.java2;

public class CustomerTest {
public static void main(String[] args) {
	Customer c1 = new Customer("Jane", "Smith");
	c1.setAccount(new Account(1000,2000,0.0123));
	
	c1.getAccount().deposit(100);
	c1.getAccount().withdraw(960);
	c1.getAccount().withdraw(2000);
	
	System.out.println("Customer [" + c1.getFirstName() + ", " + c1.getLastName() + "has a account: id is"
			+ c1.getAccount().getId() + ", annualInterestRate is " + c1.getAccount().getAnnualInterestRate() * 100
			+ "%, balance is " + c1.getAccount().getBalance());
}
}
 