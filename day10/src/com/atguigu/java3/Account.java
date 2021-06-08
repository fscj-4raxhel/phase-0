package com.atguigu.java3;

public class Account {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposite(double amt) {
		if(amt >0 ) {
			balance += amt;
			System.out.println("Successfully deposited");
		}
		
	}
	
	public void withdraw (double amt){
		if(balance >= amt) {
			balance -= amt;
			System.out.println("Withdraw Successed!");
		}else {
			
			System.out.println("Not enought money");
		}
		
	}
}
