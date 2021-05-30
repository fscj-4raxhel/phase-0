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
		for (;;) {
			id = CMUtility.readInt();
			cust = list.getCustomer(id - 1);
			if (cust != null) {
				break;
			}
		}
		// Modify Customer Information
		System.out.println("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.println("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(10, cust.getPhone());
		System.out.println("邮箱(" + cust.getName() + "):");
		String email = CMUtility.readString(30, cust.getEmail());

		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean replaceSuccess = list.replaceCustomer(id - 1, newCust);
		if (replaceSuccess) {
			System.out.println("---------------------修改完成---------------------");

		} else {
			System.out.println("----------无法找到指定客户,修改失败--------------");
		}
	}

	public void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		int id = 0;
		Customer cust = null;
		for (;;) {
			System.out.print("请选择待删除客户编号(-1退出)：");
			id = CMUtility.readInt();
			if (id == -1) {
				return;
			}
			// 校验用户输入值知否合理,尝试把那个位置上的Customer 对象拿出来
			cust = list.getCustomer(id - 1);
			if (cust != null)
				break;
			else {
				System.out.println("无法找到指定客户！");
			}
		}
		//删除操作的执行，通过CustomerList提供的服务
		System.out.print("确认是否删除(Y/N)：");
		char deleteCust = CMUtility.readChar();
		if (deleteCust == 'Y') {
			boolean deleteSuccess = list.deleteCustomer(id - 1);
			if (deleteSuccess) {
				System.out.println("---------------------删除完成---------------------");

			} else {
				System.out.println("----------无法找到指定客户,删除失败--------------");
			}
		}

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