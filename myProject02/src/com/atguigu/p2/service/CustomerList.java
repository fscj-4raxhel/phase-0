package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * 
 * 这个类是厨师，负责做菜的，具体的增删改查服务都是在这里进行的
 * 
 * @author Chris
 *
 */
public class CustomerList {
	private Customer[] customerList;
	private int total = 0;

	public CustomerList(int limit) {
		this.customerList = new Customer[limit];
	}

	public boolean addCustomer(Customer cust) {
		if (total < this.customerList.length) {
			customerList[total++] = cust;
			return true;
		} else {
			return false;
		}
	}

	public boolean replaceCustomer(int index, Customer cust) {
		if (index >= 0 && index < total) {
			customerList[index] = cust;
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteCustomer(int index) {
		if (index >= 0 && index < total) {
			for (int i = index + 1; i < total; i++) {
				customerList[i - 1] = customerList[i];
			}
			//自己写的时候忘记把末尾的元素删掉了
			customerList[--total] = null;
			return true;
		} else {
			return false;
		}
	}
	
	public Customer[] getAllCustomers() {
		Customer[] res = new Customer[total];
		for(int i = 0; i < res.length; i++) {
			res[i] = this.customerList[i];
		}
		return res;
	}
	
	public Customer getCustomer(int index) {
		if(index >=0 && index < total) {
			return this.customerList[index];
		}else
			return null;
	}
	
	public int getTotal() {
		return this.total;
	}

}
