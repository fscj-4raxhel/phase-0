package com.atguigu.team.junit;

import org.junit.Test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;

public class NameListServiceTest {

	@Test
	public void getAllEmployeesTest() {

		NameListService service = new NameListService();
		Employee[] emps = service.getAllEmployees();
		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i]);
		}

	}
}
