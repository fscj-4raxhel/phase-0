package com.atguigu.java3;

public class Bank {
	private Customer[] customers;
	
	private int numberOfCustomers;
	
	public Bank() {
		this.customers = new Customer[100];
	}
	
	public void addCustomer(String f, String l) {
		
		customers[numberOfCustomers++] = new Customer(f,l);
		
	}
	
	public int getNumOfCustomer() {return this.numberOfCustomers;}
	
	public Customer getCustomer(int index) {
		if(index >= 0 && index <numberOfCustomers) {
			return customers[index];
		}else
			return null;
		
		
	}
}
