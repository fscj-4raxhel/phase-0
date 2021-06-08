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

public class NameListService {

	private Employee[] employees;

	/**
	 * 
	 * 在这个构造器中将Data里面的员工数据创建出来，重点也是这个构造器
	 */
	public NameListService() {
		employees = new Employee[EMPLOYEES.length];
		for (int i = 0; i < EMPLOYEES.length; i++) {
			int type = Integer.parseInt(EMPLOYEES[i][0]);
			int id = Integer.parseInt(EMPLOYEES[i][1]);
			String name = EMPLOYEES[i][2];
			int age = Integer.parseInt(EMPLOYEES[i][3]);
			double salary = Double.parseDouble(EMPLOYEES[i][4]);
			double bonus = 0.0;
			Equipment equipment;
			switch (type) {
			case EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case PROGRAMMER:
				equipment = getEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case DESIGNER:
				equipment = getEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case ARCHITECT:
				equipment = getEquipment(i);
				bonus = Double.parseDouble(EMPLOYEES[i][5]);
				int stock = Integer.parseInt(EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;

			}
		}

	}

	private Equipment getEquipment(int index) {
		String[] eq = EQUIPMENTS[index];
		if (eq == null || eq.length == 0) {
			return null;
		} else {
			int eqType = Integer.parseInt(eq[0]);
			String buffer = eq[1];
			switch (eqType) {
			case PC:
				return new PC(buffer, eq[2]);
			case NOTEBOOK:
				return new NoteBook(buffer, Double.parseDouble(eq[2]));
			case PRINTER:
				return new Printer(buffer, eq[2]);
			}
		}
		return null;
	}

	public Employee[] getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(int id) throws TeamException {

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getId() == id)
				return employees[i];
		}
		throw new TeamException("Employee with id " + id + " is not found");
	}
}
