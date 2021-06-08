package com.atguigu.java;

public class StudentTest {
	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-1001);
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class Student {
	private int id;

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	public void regist(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		} else {
			// 原始方法
//			System.out.println("Invalid input data");
			// 手动抛出异常
//			throw new RuntimeException("Invalid input data");
			throw new Exception();

		}
	}
}