package com.javase.string;
/**
 * toString方法，返回打印对象的是字符串表示，原则上该字符串应当包含当前对象的属性信息
 * 
 * 加上Override便于阅读，Java编译器会检查父类中是否有这个方法
 * @author Think
 *
 */
public class ToString {
	/**
	 * 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "我重写了toString方法";
	}
	
	public static void main(String [] args) {
		ToString obj = new ToString();
		System.out.println(obj);
	}

}
