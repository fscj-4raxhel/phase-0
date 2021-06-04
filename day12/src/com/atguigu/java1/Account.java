package com.atguigu.java1;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account () {}

	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMonthlyInterest() {
		return this.annualInterestRate / 12;
	}

	public void withdraw(double amount) {

		if (amount > this.balance) {
			System.out.println("Withdraw failed: Not enough Money");
		} else {
			this.balance -= amount;
		}

	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}
}