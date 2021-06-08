package com.atguigu.java2;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public void withdraw (double amount) {
		if(balance < amount) {
			System.out.println("Not enough money, withdraw failed");
			return;
		}
		balance -= amount;
		System.out.println("Successfully withdrawed: " + amount);
	}
	
	public void deposit (double amount) {
		if(amount < 0) {
			System.out.println("Amount cannot be negative");
			return;
		}
		balance += amount;
		System.out.println("Successfully deposited: " + amount);
	}
	
}
