package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

public class Programmer extends Employee {

	private int memberID;
	private Status status = Status.FREE;// 枚举类
	private Equipment equipment;

	public Programmer() {
	}

	public Programmer(int id, String name, int age, int salary) {
		super(id, name, age, salary);
	}

	public Programmer(int id, String name, int age, double salary, Equipment equipment) {
		super(id, name, age, salary);
		this.equipment = equipment;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getDetails() + "\tProgrammer\t" + status + "\t\t\t" + equipment.getDescriptioin();
	}

	public String getDetailsForTeam() {
		return memberID + "\t" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\tProgrammer";
	}

}
