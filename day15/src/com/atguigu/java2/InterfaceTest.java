package com.atguigu.java2;

public class InterfaceTest implements AA{
	public static void main(String[] args) {
		System.out.println(x);
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}

interface Attack{
	
}

interface Flyable{
	
	public static final int MAX_SPEEED = 7900;//第一宇宙速度
	
	int MIN_SPEED = 1;//省略了 public static final
	
	public abstract void fly();
	
	public abstract void stop();
	
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("Take off");
		
	}

	@Override
	public void stop() {
		
		System.out.println("Engine stoped");
		
	}
	
	
}

abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Bullet extends Object implements Flyable, Attack{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
}

interface AA{
	int x = 1;
	void method1();
}

interface BB{
	void method1();
	
}

interface CC extends AA,BB{
	
	
}

class CCC implements AA,BB{
	
	public static void main(String[] args) {
		
	}

	@Override
	//都算，AA和BB中的method1都重写了
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}


