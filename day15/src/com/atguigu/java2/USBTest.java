package com.atguigu.java2;

public class USBTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		// 创建了接口的非匿名实现类的非匿名对象
		Flash flash = new Flash();
		com.transferData(flash);
		
		//创建了接口的非匿名实现类的匿名对象
		com.transferData(new Printer());
		//创建了接口的匿名实现类的非匿名对象
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("phone started working");
			}

			@Override
			public void stop() {
				System.out.println("phone stopped working");
			}
			
		};
		com.transferData(phone);
		//创建了接口的匿名实现类的匿名对象
		com.transferData(new USB() {

			@Override
			public void start() {
				System.out.println("Anonymous USB device started working ");
				
			}

			@Override
			public void stop() {
				System.out.println("Anonymous USB device stopped working ");

			}
			
		});
	}

}

class Computer {

	public void transferData(USB usb) {
		usb.start();

		System.out.println("Details in transferming data");

		usb.stop();
	}
}

interface USB {

	void start();

	void stop();
}

class Flash implements USB {

	@Override
	public void start() {
		System.out.println("USB disk started working");
	}

	@Override
	public void stop() {
		System.out.println("USB disk stopped working");

	}

}

class Printer implements USB {

	@Override
	public void start() {
		System.out.println("Printer started working");

	}

	@Override
	public void stop() {
		System.out.println("Printer stopped working");
	}

}