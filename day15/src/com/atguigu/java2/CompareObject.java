package com.atguigu.java2;

public interface CompareObject {
	//若返回值是 0 代表相等；若为证书，代表当前兑现打；负数代表当前对象小
	public int compareTo(Object obj);

}
