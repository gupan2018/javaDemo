package com.interfaces.language;

/*
 * 这个类主要是讲Interface的用法
 * 
 * interface语法：
 * 		1. 接口就是一个标准、规范
 * 		2. Java的接口是由interface定义，本质上是一个抽象类，但是类中的内容要求比抽象类更加严格
 * 			1. interface中只能包含常量和抽象方法
 * 			2. Java中在没有定义访问控制权限时，(**这里就这么理解，暂时没有好的表述方式**)凡是数据(double PI = 3.14159;)都是常量(public static final)，
 * 		凡是方法(void show();)都是抽象(public abstract)的。
 * 			3. 接口不能被实例化
 * 			4. 接口需要被实现，实现的方式是通过子类继承实现接口函数（**抽象类的继承通过implements关键字实现**）
 * 			5. 接口中的抽象方法都要是public的，所以子类继承时都需要加上public关键字
 * 			6. 一个类可以实现多个接口，用逗号分隔
 * 			7. 接口可以向上造型，父类接口指针可以指向子类对象
 * 			8. 接口可以通过extends关键字继承，子接口中不需要重复声明父接口中已经声明的接口
 * 
 * */




// interface中只能包含常量和抽象方法
interface Inter1 {
	public static final int NUM = 5;
	
	/*
	 * Java中在没有定义访问控制权限时，(**这里就这么理解，暂时没有好的表述方式**)凡是数据(double PI = 3.14159;)都是常量(public static final)，
	 * 凡是方法(void show();)都是抽象(public abstract)的。
	*/
	double PI = 3.1415;
	void showa2();
	
	public abstract void showa1();
}

interface Inter2 {
	public static final int NUM = 5;
	
	/*
	 * Java中在没有定义访问控制权限时，(**这里就这么理解，暂时没有好的表述方式**)凡是数据(double PI = 3.14159;)都是常量(public static final)，
	 * 凡是方法(void show();)都是抽象(public abstract)的。
	*/
	double PI = 3.1415;
	void showb2();
	
	public abstract void showb1();
}


// 接口可以通过extends关键字继承，子接口中不需要重复声明父接口中已经声明的接口
interface ChildInter extends Inter1{
	
}

// 接口需要被实现，实现的方式是通过子类继承实现接口函数（抽象类的继承通过implements关键字实现）
// 一个类可以实现多个接口，用逗号分隔
class Func implements Inter1, Inter2{
	// 接口中的抽象方法都要是public的，所以子类继承时都需要加上public关键字
	public void showb1() {};
	public void showb2() {};
	
	public void showa1() {};
	public void showa2() {};
}




class FirstInter{
	public static void main(String [] args) {
		// 接口可以向上造型
		Inter1 absObj1 = new Func();
	}
}