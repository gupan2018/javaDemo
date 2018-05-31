package src.basic.language;
/*
 * 这个类主要讲final的用法
 * 
 * final使用规则：
 * 		1. 修饰变量：变量不能被改变
 * 			1. final修饰成员变量的两种方式：
        		1. 声明的同时初始化
        		2. 构造方法中初始化
    		2. final修饰方法变量
        		1. final修饰方法变量时，定义时可以不用赋值，只需要在使用前赋值即可，赋值之后不可修改
        		
 * 		2. 修饰方法：方法不能被重写
 * 		3. 修饰类：类不能被继承，但是可以继承其他类
 * 
 * */
public class KeyWordsFilnal {
	// 声明的同时修饰变量
	final int a = 5;
	
	// 声明的同时若没有初始化，要在构造函数中初始化
	final int b;
	public KeyWordsFilnal() {
		// TODO Auto-generated constructor stub
		// 构造方法中初始化
		b = 10;
	}
	
	void finalParam() {
		// 在类方法中，
		final int c;
		// 报错，使用之前要赋值
		// System.out.println(c);
		c = 6;
		// 报错
		// c = 7;
	}
	
	
	final void finalMethod() {}
	
	public  static void main(String [] args) {
		KeyWordsFilnal obj = new KeyWordsFilnal();
	}
}

// final的类可以继承其他的类
final class KeyWordsFinalChild extends KeyWordsFilnal{
	// 报错，final修饰的方法不能被重写
	// void finalMethod() {}
}

// 报错，final修饰的类不能继承
// class KeyWordsFinalGrandChild extends KeyWordsFinalChild{}
