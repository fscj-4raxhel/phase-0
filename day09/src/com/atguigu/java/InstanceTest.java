package com.atguigu.java;
/*
 * 
 * 
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		
		p.sendEmail();
		p.playGame();
		
		new Phone().price = 1999;
		new Phone().showPrice();
	}
}


class Phone{
	double price;
	
	public void sendEmail() {
		System.out.println("send Email");
		
	}
	
	public void playGame() {
		
		System.out.println("Play Game.");
	}
	
	  public void showPrice(){
		    
		    System.out.println("Price is " + price);
		    
		  }
	
}