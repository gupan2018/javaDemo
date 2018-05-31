package com.generics.language;

import java.util.HashSet;
import java.util.Set;

/**
 * 这个类实现HasSet判断是否包含一个和自身集合中数据一样的元素
 * 
 * 重写了抽象类Comparable的compareTo方法
 * 
 * @author Think
 *
 */
public class Point implements Comparable<Point>{
	public int x;
	public int y;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		result = prime * result + this.x;
		result = prime * result + this.y;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Point) {
			Point tmp = (Point) obj;
			return this.x == tmp.x && this.y == tmp.y;
		}
		return false;
	}
	/**
	 * 定义比较规则
	 * 		一般来说，不建议修改这个方法，修改的代码越多，代码侵入性越强，这个类和程序功能的耦合性越高，越不容易分离。不利于程序扩展
	 */
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		int len = this.x * this.x + this.y + this.y;
		int olen = o.x * o.x + o.y * o.y;
		return len - olen;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String msg = "x的坐标为：" + this.x + ";" + "y的坐标为：" + this.y + "\n";
		return msg;
	}
	public static void main(String[] args) {
		Set<Point> set = new HashSet<Point>();
		set.add(new Point(1, 2));
		set.add(new Point(2, 3));
		
		// 这里返回结果要不为true必须同时重写hasCode和equals方法，否则在调用contains时，先hash到其他的内存位置，并不会比较想要比较的两个对象
		System.out.println(set.contains(new Point(1, 2)));
	}
}
