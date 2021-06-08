package com.atguigu.java2;

public class NetWorkTest {
	public static void main(String[] args) {
		Server server = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		proxyServer.browse();
	}

}

interface NetWork{
	
	public void browse();
}


//被代理类
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("Real server accessing the Net");
		
	}
	
}
//代理类
class ProxyServer implements NetWork{
	
	private NetWork work;
	
	public ProxyServer(NetWork work) {
		this.work = work;
	}
	
	public void check() {
		
		System.out.println("Checks before connecting to the Net");
	}

	@Override
	public void browse() {
		check();
		work.browse();
		
	}
	
}