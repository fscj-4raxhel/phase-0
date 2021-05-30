package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.utils.CMUtility;

public class CustomerView {

	private CustomerList list = new CustomerList(10);

	public void enterMainMenu() {
		boolean _continue_ = true;
		while (_continue_) {
			System.out.println("\n-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");
			char choice = CMUtility.readChar();
			switch (choice) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllcustomer();
				break;
			case '5':
				System.out.println("确认是否退出(Y/N)?");
				if (CMUtility.readChar() == 'Y') {
					_continue_ = false;
				}
			}
		}
	}

	public void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.println("姓名：");
		String name = CMUtility.readString(10);
		System.out.println("性别：");
		char gender = CMUtility.readChar();
		System.out.println("年龄：");
		int age = CMUtility.readInt();
		System.out.println("电话");
		String phone = CMUtility.readString(13);
		System.out.println("邮箱");
		String email = CMUtility.readString(30);

		boolean addSuccess = list.addCustomer(new Customer(name, gender, age, phone, email));
		if (addSuccess) {
			System.out.println("---------------------添加完成---------------------");

		} else {
			System.out.println("----------------记录已满,无法添加-----------------");
		}
	}

	public void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		int id = 0;
		Customer cust = null;
		for(;;) {
			id = CMUtility.readInt();
			cust = list.getCustomer(id - 1);
			if (cust != null) {
				break;
			}
		}
		//处理客户吧

	}

	public void deleteCustomer() {

	}

	public void listAllcustomer() {
		System.out.println("---------------------------客户列表---------------------------");
		int tot = this.list.getTotal();
		if (tot == 0) {
			System.out.println("没有客户记录！");
		} else {
			Customer[] custs = list.getAllCustomers();
			for (int i = 0; i < custs.length; i++) {
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge()
						+ "\t" + cust.getPhone() + "\t " + cust.getEmail());
			}
			System.out.println("-------------------------客户列表完成-------------------------");

		}
	}

	public static void main(String[] args) {
		CustomerView v = new CustomerView();
		v.enterMainMenu();
	}

}