package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

import static com.atguigu.team.service.Data.*;

/**
 * 
 * @Description
 * @author Chris
 *
 */
public class NameListService {

	private Employee[] employees;

	/**
	 * 
	 * 给employees 数组初始化
	 */
	public NameListService() {
		employees = new Employee[EMPLOYEES.length];

		for (int i = 0; i < employees.length; i++) {
			int type = Integer.parseInt(EMPLOYEES[i][0]);

			// 获取员工的基本信息
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			Equipment equipment;
			double bonus;
			int stock;
			switch (type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;

			case DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;

			case ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				stock = Integer.parseInt(EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;

			}
		}
	}

	/**
	 * 
	 * 获取指定位置index上的设备
	 * 
	 * @param i
	 * @return
	 */
	private Equipment createEquipment(int i) {

		int type = Integer.parseInt(EQUIPMENTS[i][0]);

		switch (type) {

		case PC:// 21
			return new PC(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
		case NOTEBOOK:// 22
			double price = Double.parseDouble(EQUIPMENTS[i][2]);
			return new NoteBook(EQUIPMENTS[i][1], price);
		case PRINTER:// 23
			return new Printer(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
		}

		return null;
	}

	/**
	 * 获取当前所有的员工
	 * 
	 * @return
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) throws TeamException {

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == id) {
				return employees[i];
			}
		}

		throw new TeamException("Cannot find employee");
	}

}
