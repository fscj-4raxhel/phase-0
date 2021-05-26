package com.atguigu.exer;

public class StudentTest {
	public static void main(String[] args) {
		
		Student[] students = new Student[20];
		
		for(int i = 0; i < students.length; i++ ) {
			Student temp = new Student();
			temp.number = i + 1;
			temp.state = (int) (Math.random() * (6)) + 1;
			temp.score = (int) (Math.random() * (101));
			students[i] = temp;
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].number + "," + students[i].state + "," + students[i].score);
		}
		
		for(int i = students.length -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(students[j].score > students[j + 1].score) {
					Student temp = students[j];
					students[j] = students[j+1];
					students[j + 1] = temp; 
				}
			}
			
		}
		
		System.out.println("******");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].number + "," + students[i].state + "," + students[i].score);
		}
		
	}
}

class Student{
	
	int number;// student number 
	int state;// 
	int score;
	
	
}
