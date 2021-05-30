package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * 
 * 
 * @author Chris Jin
 *
 */
public class CustomerList {
	private Customer[] customers;
	private int total = 0;
	
	/**
	 * 用来初始化cusomters
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		this.customers = new Customer[totalCustomer];
	}
	
	/**
	 * 
	 * 将指定的客户添加到数组中
	 * @param customer
	 * @return true: 添加成功 false: 添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}
		
		customers[total++] = customer;
		return true;
	}
	/**
	 * 
	 * 修改指定索引位置的客户信息
	 * @param index
	 * @param cust
	 * @return true: 修改成功 false: 修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {//体会index >= 的等号
			return false;
		}
		
		customers[index] = cust;
		return true;
	}
	/**
	 * 删除指定位置上的元素
	 * @param index
	 * @return true: 删除成功 false: 删除失败
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}else {
			/*
			 * for(int i = index + 1; i < total; i++) { this.customers[i - 1] =
			 * this.customers[i]; }
			 */
			for(int i = index; i < total - 1; i++) {
				customers[i] = customers[i + 1];
			}
//			customers[total - 1] = null;
//			total--;
			//或者
			customers[--total] = null;//体会前--
			return true;
		}
		
	}
	/**
	 * 
	 * 获取所有客户信息
	 * @return
	 */
	public Customer[] getAllCustomers() {
		Customer[] cust = new Customer[total];
		for(int i = 0; i < total; i++) {
			cust[i] = this.customers[i];
		}
		return cust;
	}
	
	public Customer getCustomer(int index) {
		if(index<0 || index >= total) {
			return null;
		}else
		return this.customers[index];
	}
	
	public int getTotal() {
		return total;
	}
	
}
