package com.atguigu.java8;

public class SubClassTest{
public static void main(String[] args) {
	SubClass s = new SubClass();
	// s.method1();//拿不到
	s.method2();
	
	s.method3();
}
}


//这就报错了报错的原因是：接口冲突，结局方法是：必须重写同名同参的列表
	//class SubClass implements CompareA, CompareB{
	//	public void method2() {
	//		System.out.println("Subclass: Shanghai");
	//	}
	//	
	//	
	//}

class SubClass extends SuperClass implements CompareA, CompareB{
	public void method2() {
		System.out.println("Subclass: Shanghai");
	}
	
	public void myMethod3() {
		method3();//自己重写的method3
		super.method3();//父类中声明的method3
		//在实现类中 调用接口中的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}
	
}