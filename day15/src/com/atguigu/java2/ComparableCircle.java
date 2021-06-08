package com.atguigu.java2;

public class ComparableCircle extends Circle implements Comparable{

	@Override
	public int compareTo(Object o) {
		if (this == o) {
			return 0;
		}
		if (o instanceof ComparableCircle) {
			ComparableCircle c = (ComparableCircle)o;
			
			//错误的写法
//			return (int) (this.getRadius() - c.getRadius());
			//正确的写法
			if(this.getRadius() > c.getRadius()) {
				return 1;
			}else if(this.getRadius() < c.getRadius()) {
				return -1;
			}else {
				return 0; //目前没有别的办法，但实际应该是抛异常的,明天抛
			}
		}
		return 0;
	}

}
