package com.atguigu.java1;

public class CheckAccount extends Account {
	private double overdraft;
	
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id,balance,annualInterestRate);
		this.overdraft = overdraft;
	}



	public void withdraw(double amount) {
		if (amount <= this.getBalance()) {
			this.setBalance(this.getBalance() - amount);
		} else if (amount <= this.getBalance() + this.overdraft) {
			this.overdraft -= amount - this.getBalance();
			this.setBalance(0);

		} else {
			System.out.println("你丫没钱了兄弟");
		}
	}



	public double getOverdraft() {
		return overdraft;
	}



	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
}
